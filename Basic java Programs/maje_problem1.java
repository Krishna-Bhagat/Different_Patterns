// how many paths are there to reach from (3,3) to (1,1)

import java.util.ArrayList;

public class maje_problem1 {
    public static void main(String[] args) {
        int row = 3, column = 3;
        int step1 = maze(row, column);
        System.out.println("To reach from point (" + row + "," + column + ") to (1,1), " + step1 + " options are there.");
        System.out.println();
        int step2 = maze_diagonal(row, column);
        System.out.println("To reach from point (" + row + "," + column + ") to (1,1) even diagonally, " + step2 + " options are there.");
        System.out.println();
        System.out.println(maze_list("", row, column));
        System.out.println();
        System.out.println(maze_list_diagonal("", row, column));

    }

    private static int maze(int row, int column) {
        if (row == 1 || column == 1)
            return 1;
        int left = maze(row - 1, column);
        int right = maze(row, column - 1);
        return left + right;
    }

    private static int maze_diagonal(int row, int column) {
        if (row == 1 || column == 1)
            return 1;
        int left = maze_diagonal(row - 1, column);
        int right = maze_diagonal(row, column - 1);
        int diagonal = maze_diagonal(row-1, column-1);
        return left + right + diagonal;
    }

    private static ArrayList<String> maze_list(String p, int row, int column) {
        ArrayList<String> list = new ArrayList<String>();
        if (row == 1 && column == 1) {
            list.add(p);
            return list;
        }
        if (column > 1)
            list.addAll(maze_list(p + "R", row, column - 1));
        if (row > 1)
            list.addAll(maze_list(p + "D", row - 1, column));
        return list;
    }

    private static ArrayList<String> maze_list_diagonal(String p, int row, int column) {
        ArrayList<String> list = new ArrayList<String>();
        if (row == 1 && column == 1) {
            list.add(p);
            return list;
        }
        if (column > 1 && row > 1)
            list.addAll(maze_list_diagonal(p + "Di", row-1, column - 1));
        if (column > 1)
            list.addAll(maze_list_diagonal(p + "R", row, column - 1));
        if (row > 1)
            list.addAll(maze_list_diagonal(p + "D", row - 1, column));
        return list;
    }
}
