class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        if (commands == null || commands.length == 0)
            return 0;
        Set<String> obstacleSet = new HashSet<>();
        for (int[] o : obstacles)
            obstacleSet.add(o[0]+","+o[1]);
        int maxVal = 0, direction = 0, x = 0, y = 0;
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        for (int command : commands) {
            if (command == -1) {
                direction = (direction + 1) % 4;
            }
            else if (command == -2) {
                direction = (direction - 1) % 4;
                if (direction < 0)
                    direction += 4;
            }
            else if (command >= 1 && command <= 9) {
                for (int i = 0; i < command; ++i) {
                    int xnext = x + directions[direction][0];
                    int ynext = y + directions[direction][1];
                    if (obstacleSet.contains(xnext + "," + ynext))
                        break;
                    x += directions[direction][0];
                    y += directions[direction][1];
                    maxVal = Math.max(maxVal, x*x + y*y);
                }
            }
        }
        return maxVal;
    }
}