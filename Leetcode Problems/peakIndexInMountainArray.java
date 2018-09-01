class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0, j = A.length - 1;
        while(A[i] < A[i+1] && A[j] < A[j - 1]) {
            i++;
            j--;
        }
        if (A[i] > A[i+1])
            return i;
        return j;
    }
}