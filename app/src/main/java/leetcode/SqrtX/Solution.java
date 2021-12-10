package leetcode.SqrtX;

public class Solution {
    public int mySqrt(int x) {
        return (int) binarySearch(x, 0, x);
    }

    private long binarySearch(long target, long low, long high){
        if(low > high){
            return -1;
        }
        long mid = (low + high)/2;
        long square = (mid * mid);
        if(target == square){
            return mid;
        } else if(((mid-1)*(mid-1)) < target && square > target){
            return mid-1;
        } else if(((mid+1)*(mid+1)) > target && square < target){
            return mid;
        } else if(square > target){
            high = mid -1;
        } else if(square < target){
            low = mid +1;
        }
        return binarySearch(target, low, high);
    }
}
