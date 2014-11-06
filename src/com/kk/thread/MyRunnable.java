package com.kk.thread;

public class MyRunnable implements Runnable {

	private int num;
	private String name;

	public MyRunnable(int num) {
		this.num = num;
	}

	public MyRunnable(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		// System.out.println(this.num);
		// System.out.println(this.num--);
		// if(this.num <= 0) {
		// System.out.println("Íê±Ï");
		// }

		try {
			for (int i = 0; i < 5; i++) {
				System.out
						.println("ThreadName:" + this.name + "," + this.num--);
				Thread.sleep(5000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
