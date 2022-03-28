package graph;


import java.util.Stack;

public class CountIslands {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };

        int[][] arr1 = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        System.out.println(new CountIslands().numIslands(arr));
        System.out.println(new CountIslands().numIslands(arr1));
    }

    public int numIslands(int[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        if (grid.length == 0) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfsTraversal(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfsTraversal(int[][] grid, boolean[][] visited, int i, int j) {
        InternalNode node = new InternalNode(i, j);

        //Position of neighbours
        int row[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int col[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        Stack<InternalNode> stack = new Stack();
        stack.push(node);
        visited[i][j] = true;

        while (!stack.isEmpty()) {

            InternalNode currentNode = stack.pop();
            visited[currentNode.x][currentNode.y] = true;

            for (int k = 0; k < 8; k++) {
                if (checkValidBoundsAndVisitedStatus(grid, visited, currentNode.x + row[k], currentNode.y + col[k])) {
                    stack.push(new InternalNode(currentNode.x + row[k], currentNode.y + col[k]));
                    visited[currentNode.x + row[k]][currentNode.y + col[k]] = true;
                }
            }
        }
    }

    private boolean checkValidBoundsAndVisitedStatus(int[][] grid, boolean[][] visited, int row, int col) {
        if ((row >= 0 && row < grid.length)
                && (col >= 0 && col < grid[0].length)
                && grid[row][col] == 1 && !visited[row][col]) {
            return true;
        }

        return false;
    }

    private static class InternalNode {
        int x;
        int y;

        public InternalNode(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
