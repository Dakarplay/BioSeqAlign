import lib.LCS;

public class App {

    public static void main(String[] args) throws Exception {
        
        String X = "ACTGAAAAATTTTTTTTTTTTTTCCGGGGGGGGGGGAAAAAAA";
        String Y = "TCAAGGGGGTCAAAAAAAAAACTGTA";

        String lcs = LCS.findLCS(X, Y);
        
        System.err.println("La subsecuencia comun mas larga es: " + lcs);
    }
}