package codingninjas;

import java.util.*;

public class MedianOfTwoArrays {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
	     Arrays.sort(nums2);   
        
        List<Integer> both=new ArrayList<Integer>();
        int i=0,j=0;
        int finalArray[]=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                both.add(nums1[i]);
                i++;
            }else if(nums1[i]>nums2[j]){
                both.add(nums2[j]);
                j++;
            }else{
                both.add(nums1[i]);
                both.add(nums2[j]);
                i++;
                j++;
            }
            
        }
        if(i==nums1.length){
             
            for(int k=j;k<nums2.length;k++){
                both.add(nums2[k]);
                
            }
        }else {
              
            for(int k=i;k<nums1.length;k++){
                both.add(nums1[k]);
            
            }
            
        }
        
        
        
        
        if(both.size()%2!=0){
            int med=(both.size()/2);
            double result=finalArray[med];
            return result;
            
        }else{
            int med=both.size()/2;
            double res=(((double)both.get(med)+(double)both.get(med-1))/2);
            return res;
            
        }
        
    }

         
	     

	public static void main(String[] args) {
		int []a1= {1,2,4,8,7};
		int a2[]= {2,5,67,8};
		findMedianSortedArrays(a1, a2);
		

	}

}
