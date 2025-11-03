//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?

import java.util.PriorityQueue;

public class kthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        for(int it:nums){
            minheap.add(it);

            if(minheap.size()>k){
                minheap.poll();
                //minheap.remove();
            }
        }
        return minheap.peek();
    }

    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        //int arr[]={3,2,3,1,2,4,5,5,6};
        int k=2;

        int resultElement=findKthLargest(arr,k);
        System.out.println(resultElement);

    }
}
