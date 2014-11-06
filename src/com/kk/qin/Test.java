package com.kk.qin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.kk.thread.MyRunnable;

public class Test {
	private static String str = "https://ws.wifiin.cn/v4/user/changeRegistPhone.do";

	public static void main(String[] args) {
		// get();
		threadPoll();
	}

	public static void threadPoll() {
//		 ExecutorService pool = Executors.newSingleThreadExecutor();//创建一个单线程的线程池
		ExecutorService pool = Executors.newFixedThreadPool(4);//创建一个单线程的线程池
		 Thread t1 = new Thread(new MyRunnable(101,"a"));
		 Thread t2 = new Thread(new MyRunnable(102,"b"));
		 Thread t3 = new Thread(new MyRunnable(103,"c"));
		 Thread t4 = new Thread(new MyRunnable(104,"d"));
		 Thread t5 = new Thread(new MyRunnable(105,"e"));
		 pool.execute(t1);
		 pool.execute(t2);
		 pool.execute(t3);
		 pool.execute(t4);
		 pool.execute(t5);
		 pool.shutdown();
		 
	}

	public static void get() {
		char ch[] = str.toCharArray();
		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0) {
				strBuffer.append("'" + ch[i] + "'");
			} else {
				strBuffer.append(",'" + ch[i] + "'");
			}
		}
		strBuffer.append(", '\\0'");
		System.out.println(strBuffer.toString());
	}

	public static void testThread() {
		// Thread t1 = new Thread(new MyRunnable(1));
		// Thread t2 = new Thread(new MyRunnable(2));
		// Thread t3 = new Thread(new MyRunnable(3));
		// Thread t4 = new Thread(new MyRunnable(4));
		// Thread t5 = new Thread(new MyRunnable(5));
		// t1.start();
		// t2.start();
		// t3.start();
		// t4.start();
		// t5.start();

		MyRunnable m = new MyRunnable(4);
		Thread t6 = new Thread(m);
		Thread t7 = new Thread(m);
		Thread t8 = new Thread(m);
		Thread t9 = new Thread(m);
		Thread t10 = new Thread(m);
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}

}
