package binarySearch.question5;


class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, pivot = 0;
        while (l < r) {
            if (nums[l] > nums[r]) {
                int mid = l + (r - l ) / 2;
                if (nums[mid] >= nums[l]) {
                    l = mid;
                }else if (nums[mid] <= nums[r]) {
                    r = mid;
                }
                if (r - l == 1) {
                    pivot = r;
                    break;
                }
            }else{
                pivot = l;
                break;
            }
        }
        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
            l = pivot; r = nums.length - 1;
        }else{
            l = 0; r = pivot - 1;
        }
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;        
    }
}

public class SearchInRotated {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.search(new int[]{2}, 2));
    }
}
