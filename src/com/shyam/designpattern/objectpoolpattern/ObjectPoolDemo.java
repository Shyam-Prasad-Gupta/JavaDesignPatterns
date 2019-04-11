package com.shyam.designpattern.objectpoolpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolDemo {

	private ObjectPool<ExportingProcess> pool;
	private AtomicLong processNo = new AtomicLong(0l);

	public void setUp() {

		pool = new ObjectPool<ExportingProcess>(4, 10, 5) {

			@Override
			protected ExportingProcess createObject() {

				// create a test object which takes some time for creation
				return new ExportingProcess(processNo.incrementAndGet());
			}
		};
	}

	public void tearDown() {
		pool.shutDown();
	}

	public void testObjectPool() {
		ExecutorService executor = Executors.newFixedThreadPool(8);

		// execute 8 threads in seperate threads
		executor.execute(new ExportingTask(this.pool, 1));
		executor.execute(new ExportingTask(this.pool, 2));
		executor.execute(new ExportingTask(this.pool, 3));
		executor.execute(new ExportingTask(this.pool, 4));
		executor.execute(new ExportingTask(this.pool, 5));
		executor.execute(new ExportingTask(this.pool, 6));
		executor.execute(new ExportingTask(this.pool, 7));
		executor.execute(new ExportingTask(this.pool, 8));

		executor.shutdown();

		try {
			executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String args[]) {

		ObjectPoolDemo objectPoolDemo = new ObjectPoolDemo();
		objectPoolDemo.setUp();
		objectPoolDemo.tearDown();
		objectPoolDemo.testObjectPool();
	}

}
