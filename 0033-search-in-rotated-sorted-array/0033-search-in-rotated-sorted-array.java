class Solution {

    public int getPivot(int[] nums, int start, int end) {

        int mid = start +(end-start)/2;

        while(start<end) {
            
           if(nums[0] <= nums[mid]) 
                start = mid+1;
            else 
                end = mid;                 
         mid = start +(end-start)/2;
        }
        return start;
    }

    public int binarySearch(int[] nums, int start, int end,int target) {

        int mid = start +(end-start)/2;

        while(start <= end) {
           if(nums[mid] == target) 
                return mid;
           if(nums[mid] < target) 
                start = mid+1;
            else 
                end = mid-1;      

         mid = start +(end-start)/2;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = getPivot(nums,0,nums.length-1);

        if( target >= nums[pivot] && target <= nums[nums.length-1]) {
            return binarySearch(nums,pivot,nums.length-1,target);
        }else {
            return binarySearch(nums,0,pivot-1,target);
        }
    }
}