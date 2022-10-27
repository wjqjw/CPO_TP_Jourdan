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
    int nbvoiture;
     voiture [] liste_voitures;
    
    
    
 public personne (String lenom, String leprenom) {
lenom = nom;
leprenom = prenom;


liste_voitures = new voiture[3];
nbvoiture=0;

    
}

 
 
 
    @Override
public String toString () {
return nom  + prenom ; 
    }


public boolean ajouter_voiture (voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire!=null){
            System.out.println(voiture_a_ajouter + "déjà prise");
            return false;
            
            
        }
        else {
            if (this.nbvoiture==3){
                System.out.println(this.nom+this.prenom+"a déjà 3 voitures");
                return false; 
            }
            else {
                this.liste_voitures[nbvoiture]=voiture_a_ajouter;
                nbvoiture +=1;
                voiture_a_ajouter.proprietaire=this;
                return true; 
            }
        }
    }
}


