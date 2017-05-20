package com.exuberant.tutorials.designpattern.producerConsumer;
import java.util.Random;

//import java.util.concurrent.ThreadLocalRandom;

public class ProducerConsumerTraditional {
	static final int NUMBERS = 100000;

	private static void producer(Common c) {
		for (int i = 0; i < NUMBERS; i++)
			// c.put(ThreadLocalRandom.current().nextInt());
			c.put(new Random().nextInt());
	}

	private static void consumer(Common c) {
		int odds = 0;
		int evens = 0;
		for (int i = 0; i < NUMBERS; i++)
			if ((c.get() % 2) == 0)
				evens++;
			else
				odds++;
		System.out.printf("Evens=%d Odds=%d%n", evens, odds);
	}

	public static void main(String[] args) {
		final Common c = new Common();
		new Thread(new Runnable() {
			@Override
			public void run() {
				producer(c);
			}
		}).start();
		consumer(c);
	}
}
