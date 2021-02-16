package com.concepts.dp.creational.singletondp;

public class ThreadSafeSingletonUsingDoubleLocking {

	private static ThreadSafeSingletonUsingDoubleLocking instance;

	private ThreadSafeSingletonUsingDoubleLocking() {
		System.out.println("Creating ThreadSafeSingletonUsingDoubleLocking Instance");
	}

	public static ThreadSafeSingletonUsingDoubleLocking getInstance() {
		System.out.println("getting ThreadSafeSingletonUsingDoubleLocking Instance");
		if (instance == null) {
			synchronized (ThreadSafeSingletonUsingDoubleLocking.class) {
				System.out.println("Checking for null very first time");
				if (instance == null) {
					instance = new ThreadSafeSingletonUsingDoubleLocking();
				}
			}
		}
		return instance;
	}

}
