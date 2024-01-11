import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hach2{

    public static String F_hachage(String val_entree) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hachage = digest.digest(val_entree.getBytes());

            // Convert byte array to hexadecimal string
            StringBuilder HexaChaine = new StringBuilder();
            for (byte b : hachage) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) HexaChaine.append('0');
                HexaChaine.append(hex);
            }

            return HexaChaine.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner (System.in);
        
				System.out.println("Inserez votre valeur (ou chaine): ");
				String val_entree = sc.nextLine();
        
        String val_sortie = F_hachage(val_entree);
        
				System.out.println("Valeur_Entree: "+ val_entree);
				System.out.println("Sortie_avec_Hachage(et compression): " + val_sortie);
    }
}
