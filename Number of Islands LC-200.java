class Solution {
    public int numIslands(char[][] grid) {
     int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    java.util.Stack<int[]> stack = new java.util.Stack<>();
                    stack.push(new int[]{i, j});
                    while (!stack.isEmpty()) {
                        int[] cell = stack.pop();
                        int r = cell[0], c = cell[1];
                        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') continue;
                        grid[r][c] = '0';
                        stack.push(new int[]{r + 1, c});
                        stack.push(new int[]{r - 1, c});
                        stack.push(new int[]{r, c + 1});
                        stack.push(new int[]{r, c - 1});
                    }
                }
            }
        }
        return count;   
    }
}