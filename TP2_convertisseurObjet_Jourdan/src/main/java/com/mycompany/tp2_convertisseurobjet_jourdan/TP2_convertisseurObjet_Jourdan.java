/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_jourdan;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TP2_convertisseurObjet_Jourdan {

    public static void main(String[] args) {
        convertisseur temp = new convertisseur ();
        
        double result = temp.CelciusVersKelvin(40);
        System.out.println(result);
        
        double result1 = temp.KelvinVersCelcius(160);
        System.out.println(result1);
        
        double result3 = temp.KelvinVersFarenheit(120);
        System.out.println(result3);
        
        double result4 = temp.FarenheitVersKelvin(60);
        System.out.println(result4);
        
        double result5 = temp.CelciusVersFarenheit(32);
        System.out.println(result5);
        
        double result6 = temp.FarenheitVersCelcius(56);
        System.out.println(result6);
    
    Scanner sc;
    sc = new Scanner (System.in);
    
    System.out.println("Choississez votre entre : 1:Celcius / 2:Kelvin / 3:Farenheit");
    int a = sc.nextInt();
    System.out.println("Choississez votre sortie : 1:Celcius / 2:Kelvin / 3:Farenheit");
    int b = sc.nextInt();
    System.out.println("Quelle est la temperature a convertir");
    int c = sc.nextInt();
    
    
    if (a==1 && b==2){
    double result12 = temp.CelciusVersKelvin(c);
    System.out.println(result12);
        
    }
    
    if (a==1 && b==3){
    double result13 = temp.CelciusVersFarenheit(c);
    System.out.println(result13);
        
    }
    
        if (a==2 && b==1){
    double result21 = temp.KelvinVersCelcius(c);
    System.out.println(result21);
        
    }
    if (a==2 && b==3){
    double result23 = temp.KelvinVersFarenheit(c);
    System.out.println(result23);
        
    }
    
    if (a==3 && b==1){
    double result31 = temp.FarenheitVersCelcius(c);
    System.out.println(result31);
        
    }
    
    if (a==3 && b==2){
    double result32 = temp.FarenheitVersKelvin(c);
    System.out.println(result32);
        
    }
        
       
        
        
    }

    
}
    
    



