/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioevaluadounosemanadosmed;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class EjercicioEvaluadoUnoSemanaDosMED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            double suma = num1 + num2;
            System.out.printf("Los números son iguales. La suma es: %.2f%n", suma);
        } else {
            double producto = num1 * num2;
            System.out.printf("Los números son diferentes. El producto es: %.2f%n", producto);
        }

        scanner.close();
    }
}
