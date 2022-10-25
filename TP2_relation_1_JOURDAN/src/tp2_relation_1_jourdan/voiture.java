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
    personne proprietaire ;
    
    
 public voiture (String lemodéle, String lamarque, int lapuissance) {
lemodéle = modèle;
lamarque = marque;
lapuissance = puissance;

proprietaire = null;
    



 }
    @Override
public String toString () {
return marque  + modèle + puissance  ; 
    }
}

