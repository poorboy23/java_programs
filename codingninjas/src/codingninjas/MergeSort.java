package codingninjas;

import java.util.Scanner;

public class MergeSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
	public static class solution {

		public static void mergeSort(int[] arr){
			// Write your code here
	        if(arr.length<=1){
	            return;
	        }
	        int [] a=new int[arr.length/2];
	        int [] b=new int[arr.length-a.length];
	        for(int i=0;i<arr.length/2;i++)
	        {
	            a[i]=arr[i];
	        }
	        for(int j=arr.length/2;j<arr.length;j++){
	            b[j-arr.length/2]=arr[j];
	        }
	        mergeSort(a);
	        mergeSort(b);
	        merge(a,b,arr);
		}
	    public static void merge(int[] a,int[] b,int[] input){
	        int i=0;int j=0;int k=0;
	        while(i<a.length&&j<b.length){
	            if(a[i]<=b[j]){
	                input[k]=a[i];
	                i++;
	                k++;
	            }
//	            else if(a[i]==b[j]) {
//	                input[k]=b[j];
//	                j++;
//	                i++;
//	                k++;
//	            }
	            else{
	                 input[k]=b[j];
	                j++;
	                k++;
	            }
	           
	        }
	        if(i<a.length){
	        while(i<a.length){
	            input[k]=a[i];
	            i++;
	            k++;
	        }
	        }
	        if(j<b.length){
	        while(j<a.length){
	            input[k]=a[j];
	            j++;
	            k++;
	        }
	        }
	        
	        
	        
	    }
	}

}
