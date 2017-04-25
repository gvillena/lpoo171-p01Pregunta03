/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.pregunta03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P01Pregunta03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese dia: ");        
        int dia = Integer.parseInt(sc.next());       
        System.out.println("Ingrese mes: ");        
        int mes = Integer.parseInt(sc.next());        
        System.out.println("Ingrese año: ");        
        int año = Integer.parseInt(sc.next());       
        
        boolean esBisiesto = false; 
        esBisiesto = ((año % 4 == 0) && (año % 100 != 0) || ( (año % 400) == 0 ));
        
        LinkedList<Integer> meses = new LinkedList<>();        
        meses.add(31); // Enero
        meses.add(esBisiesto ? 29 : 28); // Febrero
        meses.add(31); // Marzo
        meses.add(30); // Abril
        meses.add(31); // Mayo
        meses.add(30); // Junio
        meses.add(31); // Julio
        meses.add(31); // Agosto
        meses.add(30); // Setiembre
        meses.add(31); // Octube
        meses.add(30); // Noviembre
        meses.add(31); // Diciembre
        
        int n = 0;
        for (int i = 0; i < mes - 1; i++) {
            n += meses.pop();
        }        
        n += dia;        
        System.out.println("n = " + n);        
    }
    
}
