package com.mycompany.tp2_convertisseurobjet_jourdan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class convertisseur {
    public int nbConversions;
 public convertisseur(){    
nbConversions = 0 ;
}


public double CelciusVersKelvin(double Tc){
    double Tk;
    Tk= Tc + 273.15;
    nbConversions+=1;
    return Tk;
    
}
public double KelvinVersCelcius(double Tk){
    double Tc;
    Tc= Tk-273.15;
    nbConversions+=1;
    return Tc;
       
}
public double FarenheitVersCelcius(double Tf){
    double Tc;
    Tc= (Tf-32.0)/(5.0/9.0);
    nbConversions+=1;
    return Tc;
       
}
public double CelciusVersFarenheit(double Tc){
    double Tf;
    Tf= (Tc)*(5.0/9.0)+32.0;
    nbConversions+=1;
    return Tf;
       
}
public double FarenheitVersKelvin(double Tf){
    double Tk;
    Tk=(Tf-32)*5.0/9.0+273.15 ;
    nbConversions+=1;
    return Tk;
       
}
public double KelvinVersFarenheit(double Tk){
    double Tf;
    Tf= (Tk-273.15)*(9.0/5.0)+32;
    nbConversions+=1;
    return Tf;
       
}
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;


    
}
}
