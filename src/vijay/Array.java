package vijay;

public class Array {
	public static void main(String args[]) {
		String a[]= {"E430545","E430543","E430542","E430541","E430540"};
		
		//min
		int g[]={1,32,5,0,55};
		int min=g[0];
		
		//multi dimensional array
		int d[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		//for each
		for (String i:a) {
			System.out.println(i);
		}System.out.println();
		
		//printing array using traditional for loop 
		for (int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println(a[2]);
		System.out.println();
		
		//minimum
		for(int j=0;j<g.length;j++) {
			if (g[j]<min) {
				min=g[j];
			}
			
		}
		System.out.println("min: "+min);
		
		//Multi dimensional array
		for (int k=0;k<3;k++) {
			for (int l=0;l<3;l++) {
				System.out.print(d[k][l]+" ");
			}
			System.out.println();
		}
	}
}
