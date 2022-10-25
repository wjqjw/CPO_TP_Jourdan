package tp2_relation_1_jourdan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

    
public class voiture {
    String modèle;
    String marque;
    int puissance ;
    String propriétaire;
    
    
 public voiture (String lemodéle, String lamarque, int lapuissance, String proprio ) {
lemodéle = modèle;
lamarque = marque;
lapuissance = puissance;
proprio = propriétaire;
    



 }
    @Override
public String toString () {
return marque  + modèle + puissance + propriétaire ; 
    }
}

