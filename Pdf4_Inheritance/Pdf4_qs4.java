/*
 * An educational institution wishes to maintain a database of its employees. The database is
divided into a number of classes whose hierarchical relationships are shown below. Write all
the classes and defines the methods to create the database and retrieve individual information
as and when needed.
Write a driver program to test the classes.
Staff (code, name)
Teacher (subject, publication) is a Staff
Officer (grade) is a Staff
Typist (speed) is a Staff
RegularTypist (remuneration) is a Typist
CasualTypist (daily wages) is a Typist.
 */

package Pdf4;
class Staff{
	protected String code;
	protected String name;
	Staff(String c, String n){
		this.code=c;
		this.name=n;
	}
	@Override
	public String toString() {
		return "Staff [code=" + code + ", name=" + name + "]";
	}
	
	
	
}

class Teacher extends Staff{
	private String subject;
	private String publication;
	Teacher(String c, String n,String s, String p){
		super(c,n);
		this.subject=s;
		this.publication=p;
	}
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", publication=" + publication + ", code=" + code + ", name=" + name
				+ "]";
	}
	
	
}

class Officer extends Staff{
	private String grade;
	Officer(String c, String n, String g){
		super(c,n);
		this.grade=g;
	}
	@Override
	public String toString() {
		return "Officer [grade=" + grade + ", code=" + code + ", name=" + name + "]";
	}
	
}

class Typist extends Staff{
	protected double speed;
	Typist(String c, String n,double s){
		super(c,n);
		this.speed=s;
	}
	@Override
	public String toString() {
		return "Typist [speed=" + speed + ", code=" + code + ", name=" + name + "]";
	}
	
	
}

class RegularTypist extends Typist{
	private int remuneration;
	RegularTypist(String c, String n,double s, int r){
		super(c,n,s);
		this.remuneration=r;
	}
	@Override
	public String toString() {
		return "RegularTypist [remuneration=" + remuneration + ", speed=" + speed + ", code=" + code + ", name=" + name
				+ "]";
	}
}

class CasualTypist extends Typist{
	private int daily_wages;
	CasualTypist(String c, String n,double s,int d){
		super(c,n,s);
		this.daily_wages=d;
	}
	@Override
	public String toString() {
		return "CasualTypist [daily_wages=" + daily_wages + ", speed=" + speed + ", code=" + code + ", name=" + name
				+ "]";
	}
}
public class Pdf4_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staff s = new Staff("E01","Ram");
		Teacher t =new Teacher("E02","Jadu","Comp sc","XYZ");
		Officer o = new Officer("E03","Madhu","A");
		Typist ty = new Typist("E05","A Roy",15.4);
		RegularTypist rt = new RegularTypist("E06","B Sen",14,8000);
		CasualTypist ct = new CasualTypist("E07","B Roy",18,800);
		System.out.println(s.toString());
		System.out.println(t.toString());
		System.out.println(o.toString());
		System.out.println(ty.toString());
		System.out.println(rt.toString());
		System.out.println(ct.toString());
}

}

/*
 * Output :
 * Staff [code=E01, name=Ram]
Teacher [subject=Comp sc, publication=XYZ, code=E02, name=Jadu]
Officer [grade=A, code=E03, name=Madhu]
Typist [speed=15.4, code=E05, name=A Roy]
RegularTypist [remuneration=8000, speed=14.0, code=E06, name=B Sen]
CasualTypist [daily_wages=800, speed=18.0, code=E07, name=B Roy]

 */
