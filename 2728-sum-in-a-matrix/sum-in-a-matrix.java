class Solution {
    public int matrixSum(int[][] nums) {
        for(int [] row:nums){
            Arrays.sort(row);
        }
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            int maxi = 0;
            for (int j = 0; j < nums.length; j++) {
                maxi = Math.max(maxi, nums[j][i]);
            }
            sum += maxi;
        }
        return sum;
    }
}