package inheritance;

//Base class
class Course {
	String courseName;
	int duration; // in hours

	public Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}

	public void displayCourseInfo() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration + " hours");
	}
}

//First-level subclass
class OnlineCourse extends Course {
	String platform;
	boolean isRecorded;

	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}

	@Override
	public void displayCourseInfo() {
		super.displayCourseInfo();
		System.out.println("Platform: " + platform);
		System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
	}
}

//Second-level subclass
class PaidOnlineCourse extends OnlineCourse {
	double fee;
	double discount; // in percentage

	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
			double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}

	@Override
	public void displayCourseInfo() {
		super.displayCourseInfo();
		System.out.println("Course Fee: ₹" + fee);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Final Fee After Discount: ₹" + calculateFinalFee());
	}

	public double calculateFinalFee() {
		return fee - (fee * discount / 100);
	}
}

//Main class
public class EducationalCourse {
	public static void main(String[] args) {
		PaidOnlineCourse poc = new PaidOnlineCourse("Data Structures in Java", 40, "Udemy", true, 4999, 20);

		poc.displayCourseInfo();
	}
}