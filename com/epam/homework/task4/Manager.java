package com.epam.homework.task4;

public class Manager implements Runnable {
	private QueueTask pbQ;
	private String name;
	public Manager(QueueTask q, String n) {
		this.pbQ = q;
		this.name = n;
	}

	public void run() {
		Task task;

		while ((task = this.pbQ.getTask()) != null) {
			System.out.println(this.name + " get task number " + task.getTaskNumer());
		}
	}
}
