class Solution {
    public int missingNumber(int[] nums) {

        int n =nums.length;

        int xor=0;
        int xor2=0;

        for(int i=0;i<n;i++){

            xor= xor^nums[i];
            xor2=xor2^(i+1);


        }

        return (xor^xor2);














        
    }
}