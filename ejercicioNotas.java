package pruebasQueSeEnvianPorGitbush;

import java.util.Scanner;

public class ejercicioNotas {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.print("Ingrese la calificación de la materia 1: ");
        int calificacion1 = notas.nextInt();

        System.out.print("Ingrese la calificación de la materia 2: ");
        int calificacion2 = notas.nextInt();

        System.out.print("Ingrese la calificación de la materia 3: ");
        int calificacion3 = notas.nextInt();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
        if (promedio < 0 || promedio > 10) {
            System.out.println("Entrada inválida. Las calificaciones deben estar entre 0 y 10.");
        } else if (promedio <= 3) {
            System.out.println("No Aprobado");
        } else if (promedio > 3 && promedio <= 5) {
            System.out.println("Insuficiente");
        } else if (promedio > 5 && promedio <= 8) {
            System.out.println("Aceptable");
        } else if (promedio > 8 && promedio < 10) {
            System.out.println("Sobresaliente");
        } else if (promedio == 10) {
            System.out.println("Excelente");
        }

        notas.close();



    }
}
