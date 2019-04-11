package com.shyam.designpattern.objectpoolpattern;

public class ExportingProcess {

	private long processNo;

	public ExportingProcess(long processNo) {
		this.processNo = processNo;
		// do some expensive and resource consuing task
		// ........
		// ........
		System.out.println("Object with process no. " + processNo + " was created.");
	}

	public long getProcessNo() {
		return processNo;
	}
}
