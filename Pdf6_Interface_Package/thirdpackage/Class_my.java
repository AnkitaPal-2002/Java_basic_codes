package thirdpackage;
import Mypackageinterface.Myinterface;
import Myclasspackage.Myclass;
public class Class_my extends Myclass{
	Class_my() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Myinterface getinnerclassobject() {
		return new Innerclass();
	}
}
