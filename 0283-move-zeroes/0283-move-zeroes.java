class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Pointer for placing non-zero elements

        // Move non-zero elements to the front
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++; // Move left pointer to the next position
            }
        }
    }
}