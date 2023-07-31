class Solution {

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];
        Arrays.fill(candy,1);

        for(int i =1;i<n;i++) {
            if(ratings[i-1] < ratings[i] && candy[i] <= candy[i-1]) {
                candy[i] = candy[i-1] +1;
            }
            //System.out.print(candy[i]+" ");
        }

        for(int i = n-2;i>=0;i--) {

            if(ratings[i+1] < ratings[i] && candy[i] <= candy[i+1] ) {
                candy[i] = candy[i+1] +1;
            }
            System.out.print(candy[i]+" ");
        }

        int totalCandy =0;
         for(int i =0;i<n;i++) {
             totalCandy+= candy[i];
         }

    return totalCandy;
    }
}