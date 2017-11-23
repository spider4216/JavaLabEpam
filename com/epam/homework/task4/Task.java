package com.epam.homework.task4;

import java.util.Random;

public class Task implements Comparable<Task> {
	private int taskNumer;
	
	public Task(int num) {
		this.taskNumer = num;
	}
	
	public int getTaskNumer() {
		return this.taskNumer;
	}
	
	public void setTaskNumer(int taskNumer) {
		this.taskNumer = taskNumer;
	}

	public int compareTo(Task o) {
		Random rand = new Random();
		int comp = rand.nextInt(2000);
		if (comp % 2 == 0) {
			return 1;
		}

		if (comp % 3 == 0) {
			return -1;
		}

		return 0;
	}
}
