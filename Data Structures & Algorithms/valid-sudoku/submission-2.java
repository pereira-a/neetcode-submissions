class Solution {

    public static final char BLANK = '.';
    public static final int BOARD_LEN = 9;

    public boolean isValidSudoku(char[][] board) {
        // Validate rows
        for(int r = 0; r < BOARD_LEN; r++) {
            HashSet<Character> validationSet = new HashSet<>();
            for (int c = 0; c < BOARD_LEN; c++) {
                char ch = board[r][c];
                if (validationSet.contains(ch)) return false;
                else if (ch != BLANK) validationSet.add(ch);
            }
        }

        // Validate columns
        for(int c = 0; c < BOARD_LEN; c++) {
            HashSet<Character> validationSet = new HashSet<>();
            for (int r = 0; r < BOARD_LEN; r++) {
                char ch = board[r][c];
                if (validationSet.contains(ch)) return false;
                else if (ch != BLANK) validationSet.add(ch);
            }
        }

        // Validate sub-boxes
        int boxR = 0, boxC = 0;
        while (boxR < BOARD_LEN) {
            System.out.println("box: " + boxR + "," + boxC);
            
            HashSet<Character> validationSet = new HashSet<>();
            for(int r = boxR; r < boxR + 3; r++) {
                for (int c = boxC; c < boxC + 3; c++) {
                    System.out.println(r + "," + c);
                    char ch = board[r][c];
                    if (validationSet.contains(ch)) return false;
                    else if (ch != BLANK) validationSet.add(ch);
                }
            }

         
            boxC += 3;
            
            if(boxC >= BOARD_LEN) {
                boxC = 0;
                boxR +=3;
            }
        }
        return true;
    }
}