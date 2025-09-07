import lib.LCS;

public class App {
    public static void main(String[] args) {
        String X = "ACTGAAAAATTTTTTTTTTTTTTCCGGGGGGGGGGGAAAAAAA";
        String Y = "TCAAGGGGGTCAAAAAAAAAACTGTA";

        String lcs = LCS.findLCS(X, Y);

        System.out.println("The longest common subsequence is: " + lcs);
        System.out.println("Length of the LCS:: " + lcs.length());
    }
}