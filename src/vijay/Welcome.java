package vijay;


public class Welcome {
	public static void main(String args[]) {
	int n=3;
	boolean fl=true;
	
	for (int i=2;i<=n;i++) {
		if (n%i==0) {
			fl=false;
			break;
			
		}
	}
	
	if (fl==true){
		System.out.println("prime");
	}
	else {
		
		System.out.println("NPrime");
	}
	}
	

}
