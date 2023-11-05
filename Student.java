//Admission to a professional course is subject to the following conditions:
//(a) marks in Mathematics >= 60 (b) marks in Physics >=50
//(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200
// (Or)
//Total in Maths & Physics>=150
// Given the marks in the 3 subjects of n (user input) students, write a program to process
// the applications to list the eligible candidates.

package java_info_cls1;

public class Student {
	private double math;
	private double phy;
	private double chem;
	Student(){
		this.math=0;
		this.phy=0;
		this.chem=0;
	}
	public Student(double math, double phy, double chem) {
		super();
		this.math = math;
		this.phy = phy;
		this.chem = chem;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getPhy() {
		return phy;
	}
	public void setPhy(double phy) {
		this.phy = phy;
	}
	public double getChem() {
		return chem;
	}
	public void setChem(double chem) {
		this.chem = chem;
	}
	@Override
	public String toString() {
		return "[math=" + math + ", phy=" + phy + ", chem=" + chem + "]";
	}
	
	

}
