package com.shyam.designpattern.objectpoolpattern;

public class ExportingTask implements Runnable {

	private ObjectPool<ExportingProcess> pool;
	private int threadNo;

	public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {

		this.pool = pool;
		this.threadNo = threadNo;
	}

	@Override
	public void run() {

		// get an object from the pool
		ExportingProcess exportingProcess = this.pool.borrowObject();
		System.out.println("Thread " + this.threadNo + ": Object with process no." + exportingProcess.getProcessNo()
				+ " was borrowed.");

		// we can use the object from the pool to do some expensive task
		// now after work is done return back the object to the object pool

		this.pool.returnObject(exportingProcess);

		System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo()
				+ " was returned.");
	}
}