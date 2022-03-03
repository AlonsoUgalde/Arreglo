/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Arreglo {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        //primer ejemplo
        String[] nombres = {"Alonso", "Ugalde", "Espinosa"};
        System.out.println("Longitud = " + nombres.length);
        System.out.println("Longitud = " + nombres[2]);

//segundo ejemplo
        String[] materias = new String[5];
        System.out.println("Longitud = " + materias.length);
        System.out.println("elemento[0] = " + materias[0]);
        System.out.println("elemento[3] = " + materias[3]);
        materias[0] = "Estructura de datos";
        materias[1] = "Base de datos";
        materias[2] = "POO";
        materias[3] = "Programacion web";
        materias[4] = "Ensamblador y compiladores";
        System.out.println("elemento[3] = " + materias[3]);
        
        //Tercer ejemplo//
        int[] costos = new int[3];
        System.out.println("Longitud = " + costos.length);
        System.out.println("elemento[0] = " + costos[0]);
        System.out.println("elemento[2] = " + costos[2]);
        costos[0] = (int) 10;
        costos[1] = (int) 89;
        costos[2] = (int) 32;
        System.out.println("elemento[2] = " + costos[2]);
        
        //Cuarto ejemplo//
        float[] costos1 = {(float)10.56, (float)89.46, (float)56.77, (float)167.45};
        System.out.println("Longitud = " + costos.length);
        
        
        ArrayList<Prueba> p1 = new ArrayList<Prueba>();
        
        Prueba prueba1 = new Prueba(1,"AC");
        p1.add(prueba1);
        
        Prueba prueba2 = new Prueba(2,"AC");
        p1.add(prueba2);
        
        Prueba prueba3 = new Prueba(3,"AC");
        p1.add(prueba3);
        
        System.out.println("longitud de arreglo de objetos: " + p1.size());
        
        System.out.println("datos de objeto 1: " + p1.get(2).getEstatus());
        
      

    }
}
