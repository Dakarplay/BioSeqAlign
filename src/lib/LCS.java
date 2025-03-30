package lib;

public class LCS {
    
    // Método para encontrar la subsecuencia común más larga (LCS)
    public static String findLCS(String X, String Y) {

        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        // Llenando la tabla de programación dinámica
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (X.charAt(i - 1) == Y.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Reconstrucción de la LCS desde la tabla dp
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {

            if (X.charAt(i - 1) == Y.charAt(j - 1)) {

                lcs.append(X.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {

                i--;
            } else {
                
                j--;
            }
        }
        System.out.println("Longitud de la LCS: " + lcs.length());
        return lcs.reverse().toString();
    }
}