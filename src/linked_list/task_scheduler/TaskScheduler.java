package linked_list.task_scheduler;

import java.time.LocalDate;

public class TaskScheduler {
	private TaskNode head = null, current = null;

	class TaskNode {
		int taskId;
		String taskName;
		int priority;
		LocalDate date;
		TaskNode next;

		public TaskNode(int taskId, String taskName, int priority, LocalDate date) {
			this.taskId = taskId;
			this.taskName = taskName;
			this.priority = priority;
			this.date = date;
			this.next = null;

		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addAtBeginning(int taskId, String taskName, int priority, LocalDate date) {
		TaskNode newNode = new TaskNode(taskId, taskName, priority, date);
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			TaskNode tail = head;
			while (tail.next != head) {
				tail = tail.next;
			}
			newNode.next = head;
			tail.next = newNode;
			head = newNode;
		}
	}

	public void addAtEnd(int taskId, String taskName, int priority, LocalDate date) {
		TaskNode newNode = new TaskNode(taskId, taskName, priority, date);
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			TaskNode tail = head;
			while (tail.next != head) {
				tail = tail.next;
			}
			tail.next = newNode;
			newNode.next = head;
		}
	}

	public void addAtPosition(int position, int taskId, String taskName, int priority, LocalDate date) {
		TaskNode newNode = new TaskNode(taskId, taskName, priority, date);
		if (position <= 0 || head == null) {
			addAtBeginning(taskId, taskName, priority, date);
			return;
		}

		int index = 0;
		TaskNode temp = head;
		while (index < position - 1 && temp.next != head) {
			temp = temp.next;
			index++;
		}
		newNode.next = temp.next;
		temp.next = newNode;

	}

//		Add remove a task by id method
//		public void removeById(int taskId) {
//			if (isEmpty()) {
//				System.out.println("No tasks scheduled.");
//				return;
//			}
//			TaskNode temp = head;
//			while(temp.next.taskId != taskId && temp.next != head) {
//				temp = temp.next;
//			}
//			temp.next = temp.next.next;
//		}
//
//

	public void viewCurrentAndMoveNext() {
		if (isEmpty()) {
			System.out.println("No tasks scheduled.");
			return;
		}

		if (current == null)
			current = head;

		System.out.println("Current Task: " + current.taskName + " (ID: " + current.taskId + ", Priority: "
				+ current.priority + ", Due: " + current.date + ")");
		current = current.next;
	}

	// 6. Display all tasks
	public void displayTasks() {
		if (isEmpty()) {
			System.out.println("No tasks in the scheduler.");
			return;
		}

		TaskNode temp = head;
		System.out.println("Tasks:");
		do {
			System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority
					+ ", Due Date: " + temp.date);
			temp = temp.next;
		} while (temp != head);
	}

	public void searchbyPriority(int priority) {
		if (isEmpty()) {
			System.out.println("No tasks in schedeuler");
		}
		TaskNode temp = head;
		boolean found = false;
		do {
			if (temp.priority == priority) {
				System.out
						.println("Found Task: " + temp.taskName + " (ID: " + temp.taskId + ", Due: " + temp.date + ")");
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No task found with priority: " + priority);
		}
	}

}
