package coddydailyprojects;

/*
Create a 3D game board tracker that simulates multiple levels of a game grid.

Method: create3DGameBoard takes three parameters:

levels - number of game levels (depth)
rows - number of rows per level
cols - number of columns per level
Returns: A formatted string representing the 3D array.

Cell Value Calculation:

Each cell's value is calculated as follows:

Base value: Add the 1-based position indices:
(level index + 1) + (row index + 1) + (col index + 1) 
This is the starting value before applying any edge rules. 

Examples:
Cell at [0][0][0]: base value = 1 + 1 + 1 = 3
Cell at [1][2][3]: base value = 2 + 3 + 4 = 9

Edge multiplier: Multiply the base value by 10 if the cell is on the outer boundary:

Level is the first (0) or last (levels-1), OR
Row is the first (0) or last (rows-1), OR
Column is the first (0) or last (cols-1)
This rule is applied AFTER calculating the base value. Examples:

Cell [0][0][0]: base = 3, on boundary (first level, first row, first col) → 3 × 10 = 30
Cell [0][1][1]: base = 5, on boundary (first level) → 5 × 10 = 50
Cell [1][1][1] (in a 3×3×3 board): base = 6, NOT on any boundary → stays 6 (no multiplier)
Your task: Implement the logic to fill the 3D array with the correct calculated values.


*/




class Create3DGameBoard {
    public static String create3DGameBoard(int levels, int rows, int cols) {
        if (levels <= 0 || rows <= 0 || cols <= 0) {
            return "";
        }
        
        int[][][] board = new int[levels][rows][cols];
        
        for (int l = 0; l < levels; l++) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    int baseValue = (l + 1) + (r + 1) + (c + 1);
                    boolean isEdge = l == 0 || l == levels-1 || 
                                   r == 0 || r == rows-1 || 
                                   c == 0 || c == cols-1;
                    board[l][r][c] = isEdge ? baseValue * 10 : baseValue;
                }
            }
        }
        
        String result = "";
        for (int l = 0; l < levels; l++) {
            result += "Level " + l + ":\n";
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    result += board[l][r][c];
                    if (c < cols - 1) result += " ";
                }
                result += "\n";
            }
            if (l < levels - 1) result += "\n";
        }
        
        return result;
    }
}