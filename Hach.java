import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hach{
    public static String F_hachage(String val_entree) {
        try {
            // Création de l'objet MessageDigest avec l'algorithme MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Calculer le hachage de l'entrée
            byte[] messageDigest = md.digest(val_entree.getBytes());
            
            // Convertir le tableau de bytes en représentation hexadécimale
            BigInteger no = new BigInteger(1, messageDigest);
            String Text_hachage = no.toString(16);
             
            // Remplir avec des zéros s'il est nécessaire
            while (Text_hachage.length() < 32) {
                Text_hachage = "0" + Text_hachage;
            }
            
            return Text_hachage;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erreur lors du hachage", e);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
					System.out.println("Inserez votre valeur (ou chaine): ");
					String val_entree = sc.nextLine();
        
        String hachage = F_hachage(val_entree);
        
					System.out.println("Valeur_Entree: " + val_entree);
					System.out.println("Sortie_avec_Hachage(et compression): " + hachage);
    }
}
