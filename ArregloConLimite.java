/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloconlimite;

/**
 *
 * @author MIGUELH
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class ArregloConLimite {

   public static void main(String[] args) {
        // TODO code application logic here
        int datos[] = new int[5];
        int numero;
        int i = 0;
        String datoEntrada;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
           
        
        try{
            while(i <= 5){
                System.out.println("Ingrese un numero");
                datoEntrada = flujoEntrada.readLine();           
                numero = Integer.parseInt(datoEntrada);
                if(numero >= 10){
                  if(numero <= 30){
                    System.out.println("BIEN "+ numero);
                }else{
                    System.out.println("!!!!!!ERROR!!!: el numero no esta entre 10 y 30");
                }
                    System.out.println("BIEN"+ numero);
                }else{
                    System.out.println("!!!!!!ERROR!!!: el numero no esta entre 10 y 30");
                }
                
              
                
                
                
            }
        }catch (IOException error)
        {
           System.err.println("Error " + error.getMessage());
        }  
        
    } 
}
