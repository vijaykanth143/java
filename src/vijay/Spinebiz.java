package vijay;
import java.util.*;

public class Spinebiz {
	public void itApps(int a,int b) {
		System.out.println("Employee1 ID: "+a+" Employee2 ID: "+b);
	}
	public void fullname() {
		Scanner obj=new Scanner(System.in);
		System.out.println("First name: ");
		String Fname=obj.next();
		System.out.println("Last name: ");
		int Lname=obj.nextInt();
		double y=Lname;
		System.out.println("FullName of Empoyee: "+(Fname+y));
	}
	public void add() {
		Scanner obj=new Scanner(System.in);
		System.out.println("First Num: ");
		int Fname=obj.nextInt();
		System.out.println("Last Num: ");
		int Lname=obj.nextInt();
		System.out.println("FullName of Empoyee: "+(Fname+Lname));
		
	}
	public static void main(String args[]) {
		Spinebiz s=new Spinebiz();
		s.itApps(221,222);
		s.fullname();
		s.fullname();
		s.add();
	}
}
