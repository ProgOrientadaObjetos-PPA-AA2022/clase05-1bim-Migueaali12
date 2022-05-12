package paquete1;

import java.util.Scanner;

public class Ejecutor2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Ingrese su barrio: ");
        String bar = sc.nextLine();
        
        Barrio barrio1 = new Barrio(bar);
        
        System.out.println("Ingrese nombre: ");
        String nom = sc.nextLine();
        
         System.out.println("Ingrese la cedula: ");
        String ced = sc.nextLine();
        
        Persona persona1 = new Persona(nom,ced,barrio1);
        
        System.out.printf("%s\n",persona1);
        

    }

}
