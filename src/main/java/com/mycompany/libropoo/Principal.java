package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {//abre principal

   
    public static void main(String[] args) { //abre main Complejidad Temporal: Tiempo Constante 0(1)
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro, el nombre de su autor, el genero y año de aplicacion");
        String titulo = sc.nextLine();
        String autor = sc.nextLine();
        String genero = sc.nextLine();
        int anoPublicacion = sc.nextInt();
        Libro libro = new Libro(titulo, autor, genero, anoPublicacion);
        System.out.println(libro.mostrarInformacion());
        libro.marcarLeido();
        if (libro.leido == true) {
            System.out.println("El Libro ya fue leído");
        }else{
            System.out.println("El Libro no ha sido leído");
        }//cierra else
        System.out.println("EL libro es Antiguo? " + libro.esAntiguo());
    
    
    }//cierra main
    
    
}//cierra principal
