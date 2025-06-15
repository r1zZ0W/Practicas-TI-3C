package Gestor_Estudiantes;

import Gestor_Estudiantes.Model.*;

public class GestorEstudiantes{

    public static void main(String[] args) {

        Curso curso = new Curso("POO001", "Programacion Orientada a Objetos", 3);

        Estudiante Antonio = new Estudiante("Antonio Acevedo Osorio", "20243ds076@utez.edu.mx", 9.44);
        Estudiante Alberto = new Estudiante("Luis Alberto Peralta Fuentes","20243ds068@utez.edu.mx",9.11);
        Estudiante Carlos = new Estudiante("Juan Carlos Gonzalez Salgado","20243ds085@utez.edu.mx",10);
        Estudiante Renata = new Estudiante("Renata Perez Mojica", "juan@20243ds001utez.edu.mx", 8.8);

        System.out.println("------------Inscripciones------------");
        System.out.println("¿Esta inscrito: " + Antonio.getNombre() + "? " + (curso.inscribir(Antonio) ? "Chi" : "Ño"));
        System.out.println("¿Esta inscrito: " + Alberto.getNombre() + "? " + curso.inscribir(Alberto));
        System.out.println("¿Esta inscrito: " + Carlos.getNombre() + "? " + curso.inscribir(Carlos));
        System.out.println("¿Esta inscrito: " + Renata.getNombre() + "? " + curso.inscribir(Renata));

        System.out.println("------------Promedio Grupal------------");
        System.out.println("El promedio grupal es de: " + curso.calcularPromedioGrupo());


    }

}