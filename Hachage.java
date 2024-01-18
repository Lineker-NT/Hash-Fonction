package crypto;
import java.util.*; 
public class Hachage{
	
	/*
	 1) outils nécessaires :  classe Scanner, dictionnaire, ArraryList...
	*/
	    static Scanner sc = new Scanner (System.in);
    static Map<String, String> dico =new HashMap<>();
    static ArrayList listval = new ArrayList();
    static ArrayList listcle = new ArrayList();
    
	public static void main (String[] args) {
	 
	 /*	
	 2) Création d'un tableau inialisé par les digest à taille fixée...
	 */		
        	String []tab_digest={
        					             "111ffaaccda111cd","222b0aaccbd222ab",
        		              "333cfaacccb333aa","444f99aaccfe444b",
        		              "555fb99ccdd555cc","666bbaacccc666dd",
        		              "777aa8cccdf777ee","888ddaaccfd888ff",
        		              "123ddccabdd321bd","000bb11aab90cd99",
        		              "101ee5acca1019e9","202edabcc00002fe",
        		              "373ffaaccddddd33","965ffaaccddabc00"
        		                };
        		              	
	/*
	   ----------------------------------------------------------------
	   une boucle de retour au programme 
	*/	              
    		  char reponse = 'o';
    		  while(reponse =='o'){
	/*
	  ----------------------------------------------------------------
	  3) Début du programme avec l'entrée d'une valeur à hacher 
	*/
        		 System.out.println("Donner la valeur a hacher : ");
        		 String entree = sc.nextLine();
        	 
	/*
	  ----------------------------------------------------------------
	  4)Transformation du tableau des clé (digest) en ArrayList, pour faciliter 
	    le choix aléatoire d'une digest partant de son indice dans la liste
	*/   
	    List<String> listeC = new ArrayList<>(Arrays.asList(tab_digest));
		/*choix Aléa d'une chaine */
            		Random r = new Random(); 
            		int indexAlea=r.nextInt(listeC.size());
            		String digest = listeC.get(indexAlea);
		
	/*
	  ----------------------------------------------------------------
	  5)Définition d'une Dictionnaire;
	  --> La clé du dico est la veleur d'entrée
	  --> La valeur du dico  est la clé (digest) récupérée au hasard dans le tableau
	*/
            		dico.put(entree,digest);
            		System.out.println("Valeur --> "+entree+"\nDigest --> "+digest);
	/*
	  ----------------------------------------------------------------
	  6) Vérification par la deuxième entrée au clavier,
	     testant la valeur déjà attribuée la clé (digest),
	     si cette valeur existe, elle renvoit sa clé (digest)
	*/
            		System.out.println("\nEntrer une valeur 2 (*pour tester les caractériqtiques*) : ");
            		String entree2 = sc.nextLine();
    		      
    		         
            		
            		if (entree2.equals(entree)){  /*si la valeur existe déjà*/
            			    System.out.println("Valeur --> "+entree+"\nDigest --> "+digest); 
            			 }
    		      
            			
            			
            		else {
            			
            				/*
            					Si la valeur n'existe pas,
            					on reprend le processus d'attribuer un digest  de manière arbitraire,
            					* cette foi-ci avec changement de variable d'instance et d'index
            				*/
                    					Random r2 = new Random(); 
                    					int indexAlea2=r2.nextInt(listeC.size());
                    					 
                    					String digest2 = listeC.get(indexAlea2);
                    				/*
                    				  Rédéfinition dans le Dictionnaire des nouveaux éléments (valeur-digest)
                    				   
                    				*/
                    					dico.put(entree2,digest2);
                    					System.out.println("Valeur --> "+entree2+"\nDigest --> "+digest2);
                    			
                    			}
    		      
    		      
    		      
            			
			
        		System.out.println("\nReconnecter/Quitter ? (o/n) ");
        		reponse = sc.nextLine().charAt(0);
        		  
	                  }
	
	System.out.println("Au revoir...");
		 
	
	     }
}

