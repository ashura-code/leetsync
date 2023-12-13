class Solution {
    public int numSpecial(int[][] mat) {

        int ans = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    int r = checkRow(mat, i);
                    int c = checkCol(mat, j);
                    if (r == 1 && c == 1) {
                        ans++;
                    }
                }
            }
        }

        return ans;

    }

    public int checkRow(int[][] mat, int row_no) {
        int tot = 0;
        for (int i = 0; i < mat[0].length; i++) {
            tot = tot + mat[row_no][i];
        }
        if (tot == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int checkCol(int[][] mat, int col_no) {
        int tot = 0;
        for (int i = 0; i < mat.length; i++) {
            tot = tot + mat[i][col_no];
        }
        if (tot == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
