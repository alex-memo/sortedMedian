package sortedMedian;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(findMedianSortedArrays(new int[]{1,2},new int [] {3,4}));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0; int[]merged=new int[nums1.length+nums2.length];
        while(i<nums1.length+nums2.length){
            if(i<nums1.length){
                merged[i]=nums1[i];
            }
            else{
               merged[i]=nums2[i-nums1.length]; 
            }
            i++;
        }
        Arrays.sort(merged);
        if(merged.length%2==1) {
        	return merged[merged.length/2];
        	
        }
        else {
        	int temp=merged.length/2;
        	return (float)(merged[temp]+merged[temp-1])/2;
        	
        }
    }

}
