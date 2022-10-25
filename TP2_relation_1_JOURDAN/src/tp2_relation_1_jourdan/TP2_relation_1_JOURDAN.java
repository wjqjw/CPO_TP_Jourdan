/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_jourdan;

/**
 *
 * @author Dell
 */
public class TP2_relation_1_JOURDAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
voiture uneClio = new voiture ("Clio", "Renault", 5 ) ;
voiture uneAutreClio = new voiture ("Clio", "Renault", 5 ) ;
voiture une2008 = new voiture ("2008", "Peugeot", 6 ) ;
voiture uneMicra = new voiture ("Micra", "Nissan", 4 ) ;
personne bob = new personne("Bobby", "Sixkiller");
personne reno = new personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
   
    
    
bob.liste_voitures[0] = uneClio ;
bob.nbvoiture = 1 ;
uneClio.proprietaire = bob ;  
System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;

bob.liste_voitures[1] = une2008 ;
bob.nbvoiture = 2 ;
une2008.proprietaire = bob ;  
System.out.println("la seconde voiture de Bob est " + bob.liste_voitures[1] ) ;

reno.liste_voitures[0] = uneAutreClio ;
reno.nbvoiture = 1 ;
uneAutreClio.proprietaire = reno ;  
System.out.println("la premiere voiture de reno est " + reno.liste_voitures[0] ) ;
    
    
reno.liste_voitures[1] = uneMicra ;
reno.nbvoiture = 2 ;
uneMicra.proprietaire = reno ;  
System.out.println("la seconde voiture de reno est " + reno.liste_voitures[1] ) ;
    
    
    
    }
    
}
