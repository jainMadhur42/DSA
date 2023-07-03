class Solution {

    public void merge(int[] arr, int start, int end) {
		int mid = (start+end)/2;

		int len1 = mid-start+1;
		int len2 = end - mid;

		int[] first = new int[len1];
		int[] second = new int[len2];

		int k = start;
		for(int i =0; i<len1; i++) {
			first[i] = arr[k++];
		}

		k = mid+1;
		for(int i =0; i<len2; i++) {
			second[i] = arr[k++];
		}

		int index1 = 0;
		int index2 = 0;
		k = start;
		while(index1 < len1 && index2 < len2) {
			if(first[index1] < second[index2]) {
				arr[k++] = first[index1++];
			} else {
				arr[k++] = second[index2++];
			}
		}

		while(index1 < len1) {
			arr[k++] = first[index1++];
		}

		while(index2 < len2) {
			arr[k++] = second[index2++];
		}
	}

	public void solve(int start, int end, int[] arr) {

		if(start >= end) {
			return;
		}

		int mid = (start + end)/2;
		solve(start, mid, arr);
		solve(mid+1, end, arr);
		merge(arr, start, end);
	}

    public int[] sortArray(int[] nums) {

        solve(0, nums.length-1, nums);
        return nums;
    }
}