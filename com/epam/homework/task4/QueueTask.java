package com.epam.homework.task4;

import java.util.concurrent.PriorityBlockingQueue;

public class QueueTask {
	private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
	
	public Task getTask() {
		return this.queue.poll();
	}
	
	public void setTask(Task task) {
		this.queue.add(task);
	}
	
	public PriorityBlockingQueue<Task> getQueue() {
		return this.queue;
	}
}
