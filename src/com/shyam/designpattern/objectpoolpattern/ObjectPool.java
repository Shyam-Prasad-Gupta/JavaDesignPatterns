package com.shyam.designpattern.objectpoolpattern;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * For more info about the object pool design pattern go to the below link
 * {@link}https://www.javatpoint.com/object-pool-pattern
 * 
 * @author shyam
 *
 * @param <T>
 */
public abstract class ObjectPool<T> {

	private ConcurrentLinkedQueue<T> pool;

	private ScheduledExecutorService executorService;

	public ObjectPool(final int minObjects) {
		// initialize pool
		initialize(minObjects);
	}

	public ObjectPool(final int minObjects, final int maxObjects, final long validationInterval) {
		// initialize pool
		initialize(minObjects);

		// check pool condition in a seperate thread
		executorService = Executors.newSingleThreadScheduledExecutor();

		executorService.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				int size = pool.size();

				if (size < minObjects) {
					int sizeToBeAdded = minObjects + size;
					for (int i = 0; i < sizeToBeAdded; i++) {
						pool.add(createObject());
					}
				} else if (size > maxObjects) {
					int sizeToBeRemoved = size - maxObjects;
					for (int i = 0; i < sizeToBeRemoved; i++) {
						pool.poll();
					}
				}
			}
		}, validationInterval, validationInterval, TimeUnit.SECONDS);
	}

	public T borrowObject() {
		T object;

		if ((object = pool.poll()) == null) {
			object = createObject();
		}

		return object;
	}

	public void returnObject(T object) {
		if (object == null) {
			return;
		}
		this.pool.offer(object);
	}

	/*
	 * shutdown this pool
	 */
	public void shutDown() {
		if (executorService != null) {
			executorService.shutdown();
		}
	}

	/*
	 * Creates and returns a new object.
	 */
	protected abstract T createObject();

	private void initialize(int minObjects) {
		pool = new ConcurrentLinkedQueue<T>();
		for (int i = 0; i < minObjects; i++) {
			pool.add(createObject());
		}
	}
}