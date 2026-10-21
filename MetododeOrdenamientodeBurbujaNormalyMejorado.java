/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metododeordenamientodeburbujanormalymejorado;

/**
 *
 * @author marti
 */
public class MetododeOrdenamientodeBurbujaNormalyMejorado {

    public static void ordenamientoBurbuja(int[] arreglo) {
        for (int j = 0; j < arreglo.length - 1; j++) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                }
            }
        }
    }

    // 2. Método de Burbuja Mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    // 3. Método Main para probar todo
    public static void main(String[] args) {
        int[] numeros = {4, 1, 8, 6, 3, 9, 5, 2};

        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // Probamos tu método mejorado
        ordenamientoBurbujaMejorado(numeros);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método auxiliar para imprimir sin repetir código
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Salto de línea
    }
}
