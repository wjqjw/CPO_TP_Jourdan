package tp2_relation_1_jourdan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class personne {
    String nom;
    String prenom;
     voiture [] liste_voitures;
    
    
    
 public personne (String lenom, String leprenom) {
lenom = nom;
leprenom = prenom;
liste_voitures= new voiture[3];


    



 }
    @Override
public String toString () {
return nom  + prenom + liste_voitures ; 
    }
}
