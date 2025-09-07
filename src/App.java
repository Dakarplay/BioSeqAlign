import lib.LCS;

public class App {
    public static void main(String[] args) {
        String X = "ACTGAAAAATTTTTTTTTTTTTTCCGGGGGGGGGGGAAAAAAA";
        String Y = "TCAAGGGGGTCAAAAAAAAAACTGTA";

        String lcs = LCS.findLCS(X, Y);

        System.out.println("La subsecuencia común más larga es: " + lcs);
        System.out.println("Longitud de la LCS: " + lcs.length());
    }
}