/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.p3.p1;
import javax.swing.JOptionPane;

/**
 *
 * @author
 * José Eduardo De Llano Barragán   A01410712   IC
 * Alberto Barnetche Suarez         A01411570   ISS
 * Carlos Barragán Carrión          A01410357   IMT
 * Carlos Miguel De León García     A01410399   IMA
 * 
 */

public class SPPCBarraganCP3P1 {

    public static void main(String[] args) {
           int cantidad;
        
        cantidad = solicitarEntero("Introduzca la cantidad de materias:");
        
        String [][] array = new String [4][cantidad];
        
        for (int i=0; i<array.length; i++){
            
        array[i][0]=solicitarString("Nombre de la materia:");
        array[i][1]=solicitarDouble("Introduzca calificación del parcial l:");
        array[i][2]=solicitarDouble("Introduzca calificación del parcial 2:");
        array[i][3]= (array[i][2] + array[i][1]);
    }
        System.out.println(array[4][3]);
        
    }
    
    
    public static int solicitarEntero(String m){
        
        int num = 0;
        boolean ño;
        
        do{
            try{
                String data = JOptionPane.showInputDialog(null, m);
                num = Integer.parseInt(data);
                
                ño = true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error!");
                ño = false;
            }
                }while(false==ño);
        return num;
    }
    
    public static String solicitarString(String m){
        String data = "";
        boolean ño;
        do{
            try{
                data =JOptionPane.showInputDialog(null, m);
                ño=true; 
            }catch (Exception e){
                JOptionPane.showInputDialog(null, "Error");
                ño=false;
            }
        }while(false==ño);
        return data;
    }
    
    public static String solicitarDouble(String m){
        double num=0;
        String d="", dato="";
        boolean ño;
        do{
            try{
                dato=JOptionPane.showInputDialog(null, m);
                num = Double.parseDouble(dato);
                ño=true;
            }catch (Exception e){
                JOptionPane.showInputDialog(null, "Error");
                ño=false;
            }
        }while(false==ño);
        d=String.valueOf(num);
    return d;

    }
}