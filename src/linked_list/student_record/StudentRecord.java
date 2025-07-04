package linked_list.student_record;

public class StudentRecord {
	StudentNode head;

	class StudentNode {
		String name;
		int rollNumber;
		int age;
		String grade;
		StudentNode next;

		StudentNode(String name, int rollNumber, int age, String grade) {
			this.name = name;
			this.rollNumber = rollNumber;
			this.age = age;
			this.grade = grade;
			this.next = null;
		}
	}

	public void addStudent(String name, int rollNumber, int age, String grade) {
		StudentNode newStudent = new StudentNode(name, rollNumber, age, grade);
		if (head == null) {
			head = newStudent;
		} else {
			StudentNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newStudent;
		}
	}

	public void addStudentAtBeginning(String name, int rollNumber, int age, String grade) {
		StudentNode newStudent = new StudentNode(name, rollNumber, age, grade);
		if (head == null) {
			head = newStudent;
		} else {
			newStudent.next = head;
			head = newStudent;
		}
	}

	public void addStudentAtPosition(String name, int rollNumber, int age, String grade, int position) {
		StudentNode newStudent = new StudentNode(name, rollNumber, age, grade);
		if (position < 0) {
			System.out.println("Invalid position");
			return;
		} else {
			if (position == 0) {
				addStudentAtBeginning(name, rollNumber, age, grade);
			} else {
				StudentNode current = head;
				int index = 0;
				while (current != null && index < position - 1) {
					current = current.next;
					index++;
				}
				if (current == null) {
					System.out.println("Position out of bounds");
				} else {
					newStudent.next = current.next;
					current.next = newStudent;
				}
			}
		}
	}

	public void displayStudents() {
		StudentNode current = head;
		while (current != null) {
			System.out.println("Name: " + current.name + ", Roll Number: " + current.rollNumber + ", Age: "
					+ current.age + ", Grade: " + current.grade);
			current = current.next;
		}
	}

	public void deleteStudent(int rollNumber) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.rollNumber == rollNumber) {
			head = head.next;
			return;
		}
		StudentNode current = head;
		while (current.next != null && current.next.rollNumber != rollNumber) {
			current = current.next;
		}
		if (current.next == null) {
			System.out.println("Student with roll number " + rollNumber + " not found");
		} else {
			current.next = current.next.next;
			System.out.println("Student with roll number " + rollNumber + " deleted");
		}
	}

	public void searchStudent(int rollNumber) {
		StudentNode current = head;
		while (current != null) {
			if (current.rollNumber == rollNumber) {
				System.out.println("Student found: Name: " + current.name + ", Roll Number: " + current.rollNumber
						+ ", Age: " + current.age + ", Grade: " + current.grade);
				return;
			}
			current = current.next;
		}
		System.out.println("Student with roll number " + rollNumber + " not found");
	}
	
	public void updateStudentGrade(int rollNumber, String newGrade) {
		StudentNode current = head;
		while (current != null) {
			if (current.rollNumber == rollNumber) {
				current.grade = newGrade;
				System.out.println("Updated grade for student with roll number " + rollNumber + " to " + newGrade);
				return;
			}
			current = current.next;
		}
		System.out.println("Student with roll number " + rollNumber + " not found");
	}
	
	public static void main(String[] args) {
		StudentRecord record = new StudentRecord();
		record.addStudent("Alice", 1, 20, "A");
		record.addStudent("Bob", 2, 21, "B");
		record.displayStudents();
		
		record.addStudentAtBeginning("Charlie", 0, 19, "C");
		record.displayStudents();
		
		record.addStudentAtPosition("David", 3, 22, "B+", 1);
		record.displayStudents();
		
		record.deleteStudent(2);
		record.displayStudents();
		
		record.searchStudent(1);
		
		record.updateStudentGrade(1, "A+");
		record.displayStudents();
		
		record.searchStudent(4); // Not found
	}
}
