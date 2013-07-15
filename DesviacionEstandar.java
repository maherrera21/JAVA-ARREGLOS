/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desviacionestandar;

import java.util.Scanner;

/**
 *
 * @author MIGUELH
 */
public class DesviacionEstandar {

public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
int suma = 0;
double media = 0, varianza = 0;


     int v1;
     System.out.print("Ingrese tamaño del vector 1:");
     v1 = leer.nextInt();
     
     int vec1[] = new int[v1];
   
     for(int i1=0; i1<vec1.length; i1++){
      System.out.print("\nIngrese Numero Entero de la Posicion"+" " +i1+":");
      vec1[i1]=leer.nextInt();
     }

    for (int i = 0; i < vec1.length; i++) {
    suma += vec1[i];
        System.out.println(vec1[i]);
    }
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + suma / vec1.length);

        media = suma / vec1.length;
    for (int i = 0; i < vec1.length; i++) {
        varianza += Math.pow(vec1[i] - media, 2);
    }
        System.out.println("La desviacion estandar es: " + Math.sqrt(varianza / vec1.length));
    }
}
