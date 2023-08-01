class Solution {

    public void rotate(int[] nums, int k) {
        
        if (k > nums.length) {
            k = k%nums.length;
        }

        int i = 0, j = nums.length - k-1;
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // for(i = 0; i<nums.length;i++) {
        //     System.out.print(nums[i]+" ");
        // }

        i = nums.length - k; j = nums.length - 1;
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        // for(i = 0; i<nums.length;i++) {
        //     System.out.print(nums[i]+" ");
        // }


        i = 0; j = nums.length -1 ;
        while(i<j) {
           int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--; 
        }

    }
}