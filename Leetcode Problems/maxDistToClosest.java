class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int max = 0;
        int i = 0;
        while (i < n) {
            while (i < n && seats[i] == 1)
                i++;
            int j = i;
            while (i < n && seats[i] == 0)
                i++;
            if (j == 0 || i == n)
                max = Math.max(max, i-j);
            else
                max = Math.max(max, (i-j+1)/2);
        }
        return max;
    }
}