/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_jourdan;

/**
 *
 * @author Dell
 */
public class TP2_Bieres_JOURDAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson"); 
        uneBiere.lireEtiquette();
        
        
        System.out.println(uneBiere);
       
        
        BouteilleBiere uneBiere2 = new BouteilleBiere("shouffe", 9.9 ,"tuson") ;
        uneBiere2.lireEtiquette();
        System.out.println(uneBiere2);
        
        
        BouteilleBiere uneBiere3 = new BouteilleBiere("P-dieux", 8.9 ,"lillas") ;
        uneBiere3.lireEtiquette();
        System.out.println(uneBiere3);
        
    }
     
        

        
    }
    
