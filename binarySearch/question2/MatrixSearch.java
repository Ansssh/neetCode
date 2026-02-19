package binarySearch.question2;

class Solution {
    public int binarySearch(int[] arr, int x, int low, int high){
        if(high >= low){
            int mid = low + (high - low) / 2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] < x){
                return binarySearch(arr, x, mid+1, high);
            }else{
                return binarySearch(arr, x, low, mid - 1);
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0, bottom = matrix.length - 1;
        int c = matrix[0].length - 1;
        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;
            if (target >= matrix[midRow][0] && target <= matrix[midRow][c]) {
                if (binarySearch(matrix[midRow], target, 0, c) != -1) {
                    return true;
                }else{
                    return false;
                }
            }else if (target < matrix[midRow][0]) {
                bottom = midRow - 1;
            }else if (target > matrix[midRow][c]) {
                top = midRow + 1;
            }
        }
        return false;
    }
}


public class MatrixSearch {

    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13));
    }    
}