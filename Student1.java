package java_info_cls1;

public class Student1 {

	private double marks;

	public Student1(double marks) {
		super();
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [marks=" + marks + "]";
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}
