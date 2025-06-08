package U1_TI.U1_TI_03_PromediosClases;

import U1_TI.U1_TI_03_PromediosClases.Model.Estudiantes;

public class PromediosClases {

    public static void main(String[] args) {

        //Estudiante numero 1
        Estudiantes studentOne = new Estudiantes();

        studentOne.setStudentName("Carlos Gonzalez");
        studentOne.setStudentId("20243ds085");

        studentOne.setStudentGrade(0, 80);
        studentOne.setStudentGrade(1, 90);
        studentOne.setStudentGrade(2, 75.5);
        studentOne.setStudentGrade(3, 80.5);
        studentOne.setStudentGrade(4, 90.5);

        System.out.println("Nombre del estudiante: " + studentOne.getStudentName());
        System.out.println("ID del estudiante: " + studentOne.getStudentId());
        System.out.println("Calificaciones del estudiante:");

        for (int i = 0; i < 5; i++) {

            System.out.println("Calificación " + (i + 1) + ": " + studentOne.getGrade(i));

        }

        System.out.println("Promedio de calificaciones: " + studentOne.getAverage());
        System.out.println("¿Aprobado? " + (studentOne.isStudentPassed()? "Sí" : "No"));
        System.out.println(" ");

        //Estudiante numero 2
        Estudiantes studentTwo = new Estudiantes();

        studentTwo.setStudentName("Antonio Acevedo");
        studentTwo.setStudentId("20243ds076");

        studentTwo.setStudentGrade(0, 90);
        studentTwo.setStudentGrade(1, 70);
        studentTwo.setStudentGrade(2, 85.5);
        studentTwo.setStudentGrade(3, 100);
        studentTwo.setStudentGrade(4, 91.5);

        System.out.println("Nombre del estudiante: " + studentTwo.getStudentName());
        System.out.println("ID del estudiante: " + studentTwo.getStudentId());
        System.out.println("Calificaciones del estudiante:");

        for (int i = 0; i < 5; i++) {

            System.out.println("Calificación " + (i + 1) + ": " + studentTwo.getGrade(i));

        }

        System.out.println("Promedio de calificaciones: " + studentTwo.getAverage());
        System.out.println("¿Aprobado? " + (studentTwo.isStudentPassed()? "Sí" : "No"));
        System.out.println(" ");

        //Estudiante numero 3
        Estudiantes studentThree = new Estudiantes();

        studentThree.setStudentName("Luis Peralta");
        studentThree.setStudentId("20243ds068");

        studentThree.setStudentGrade(0, 58.5);
        studentThree.setStudentGrade(1, 90.0);
        studentThree.setStudentGrade(2, 74.3);
        studentThree.setStudentGrade(3, 62.1);
        studentThree.setStudentGrade(4, 88.9);

        System.out.println("Nombre del estudiante: " + studentThree.getStudentName());
        System.out.println("ID del estudiante: " + studentThree.getStudentId());
        System.out.println("Calificaciones del estudiante:");

        for (int i = 0; i < 5; i++) {

            System.out.println("Calificación " + (i + 1) + ": " + studentThree.getGrade(i));

        }

        System.out.println("Promedio de calificaciones: " + studentThree.getAverage());
        System.out.println("¿Aprobado? " + (studentThree.isStudentPassed() ? "Sí" : "No"));
        System.out.println(" ");

        //Estudiante numero 4
        Estudiantes studentFour = new Estudiantes();

        studentFour.setStudentName("Daniel Hernández");
        studentFour.setStudentId("20243ds075");

        studentFour.setStudentGrade(0, 95.2);
        studentFour.setStudentGrade(1, 89.0);
        studentFour.setStudentGrade(2, 45.6);
        studentFour.setStudentGrade(3, 78.4);
        studentFour.setStudentGrade(4, 81.7);

        System.out.println("Nombre del estudiante: " + studentFour.getStudentName());
        System.out.println("ID del estudiante: " + studentFour.getStudentId());
        System.out.println("Calificaciones del estudiante:");

        for (int i = 0; i < 5; i++) {

            System.out.println("Calificación " + (i + 1) + ": " + studentFour.getGrade(i));

        }

        System.out.println("Promedio de calificaciones: " + studentFour.getAverage());
        System.out.println("¿Aprobado? " + (studentFour.isStudentPassed() ? "Sí" : "No"));
        System.out.println(" ");

        //Estudiante numero 5
        Estudiantes studentFive = new Estudiantes();

        studentFive.setStudentName("Miguel Basilio");
        studentFive.setStudentId("20243ds112");

        studentFive.setStudentGrade(0, 50.0);
        studentFive.setStudentGrade(1, 67.5);
        studentFive.setStudentGrade(2, 65.0);
        studentFive.setStudentGrade(3, 22.3);
        studentFive.setStudentGrade(4, 76.6);

        System.out.println("Nombre del estudiante: " + studentFive.getStudentName());
        System.out.println("ID del estudiante: " + studentFive.getStudentId());
        System.out.println("Calificaciones del estudiante:");

        for (int i = 0; i < 5; i++) {

            System.out.println("Calificación " + (i + 1) + ": " + studentFive.getGrade(i));

        }

        System.out.println("Promedio de calificaciones: " + studentFive.getAverage());
        System.out.println("¿Aprobado? " + (studentFive.isStudentPassed() ? "Sí" : "No"));
        System.out.println(" ");

    }
}