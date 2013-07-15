/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_unidimensional;

import java.util.Scanner;

/**
 *
 * @author MIGUELH
 */
public class Arreglo_Unidimensional {  
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     int v1,v2,v3;
     System.out.print("Ingrese tamaño del vector 1:");
     v1 = leer.nextInt();
     
     int vec1[] = new int[v1];
     
     for(int i1=0; i1<vec1.length; i1++){
      System.out.print("\nIngrese Numero de la Posicion"+" " +i1+":");
      vec1[i1]=leer.nextInt();
     }
     System.out.print("\nIngrese tamaño del vector 2:");
     v2 = leer.nextInt();
   
     int vec2[] = new int[v2];
     
     for(int i2=0; i2<vec2.length; i2++){
      System.out.print("\nIngrese Numero  de la Posicion"+" " +i2+":");
      vec2[i2]=leer.nextInt();
     }
   
     v3=v1;
     if (v2 > v1)
      v3=v2;

     int[] vec3 = new int[v3];
 
     for(int i3=0; i3<vec3.length; i3++){
      int valv1 = 0;
      if (vec1.length > i3){
       valv1 = vec1[i3];
      }
      int valv2 = 0;
            if (vec2.length > i3){
             valv2 = vec2[i3];
            }
          
            vec3[i3]=valv1+valv2;
            System.out.println("\nLa Suma de la Posicion"+" "+i3+" "+ "es:"+vec3[i3]);
             
      } 
     
    }
}
