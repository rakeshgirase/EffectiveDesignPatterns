package com.exuberant.tutorials.designpattern.producerConsumer;

/**
 * Created by rakesh on 20-05-2017.
 */
class Common {
	public static int COUNT = 100;
	private volatile int[] buffer = new int[COUNT];
	volatile int readP, writeP, size;

	public synchronized int get() {
		while (size == 0) {
			try {
				wait();
			} catch (InterruptedException ignoreInterruption) {
			}
		}
		int r = buffer[readP];
		readP = (readP + 1) % COUNT;
		size--;
		notify();
		return r;
	}

	public synchronized void put(int n) {
		while (size == COUNT) {
			try {
				wait();
			} catch (InterruptedException ignoreInterruption) {
			}
		}
		buffer[writeP] = n;
		writeP = (writeP + 1) % COUNT;
		size++;
		notify();
	}
}
