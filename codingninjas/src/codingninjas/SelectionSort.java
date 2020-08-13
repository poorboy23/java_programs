package codingninjas;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {9,8,7,8,4,1};
		
		
		for(int i=0;i<a.length-1;i++) {
			int k=i,min=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(min>a[j]) {
					min=a[j];
					k=j;
				}
			}
			
				
			int temp =a[i];
			a[i]=a[k];
			a[k]=temp;
			
			
		}
		for(int data:a) {
			System.out.println(data +" ");
		}
		

	}

}
