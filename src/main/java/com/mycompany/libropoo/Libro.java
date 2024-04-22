package com.mycompany.libropoo;

import java.time.LocalDate;

public class Libro {//abre class

private String titulo;
private String autor;
private String genero;
private int anoPublicacion;
boolean leido;
    
public Libro(String titulo, String autor, String genero,int anoPublicacion){//abre constructor Complejidad Temporal: Tiempo Constante 0(1)
this.titulo = titulo;
this.autor = autor;
this.genero = genero;
this.anoPublicacion = anoPublicacion;
this.leido = false;

    }//cierra constructor

public String mostrarInformacion(){//abre mostrar informacion Complejidad Temporal: Tiempo Constante 0(1)

return "Titulo: " + titulo + " Autor: " + autor + " Genero: " + genero + 
        " Año Publicacion: " + anoPublicacion; 
       
}//cierra mostrar informacion

public void marcarLeido(){//abre marcar leido Complejidad Temporal: Tiempo Constante 0(1)
leido = true;

}//cierra marcar leido
public boolean esAntiguo(){//abre es Antiguo Complejidad Temporal: Tiempo Constante 0(1)

return (LocalDate.now().getYear()- anoPublicacion > 50);
}//cierra es antiguo

}//cierra class
