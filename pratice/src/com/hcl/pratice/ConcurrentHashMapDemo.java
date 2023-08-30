package com.hcl.pratice;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
	static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();

	public void run() {
		try {
			Thread.sleep(1000);
			chm.put(3, "raju");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		chm.put(1, "prashanth");
		chm.put(2, "sandy");
		
		ConcurrentHashMapDemo cd = new ConcurrentHashMapDemo();
		cd.start();
		
		for(Object o :chm.entrySet()) {
			System.out.println(o);
			Thread.sleep(1000);
		}
		System.out.println(chm);

	}

}
