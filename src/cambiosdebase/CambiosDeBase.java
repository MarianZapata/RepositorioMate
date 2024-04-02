/*Ingresar un número binario de 16 dígitos y muestre a qué número
decimal, octal y hexadecimal pertenece*/
package cambiosdebase;

import java.util.Arrays;
import java.util.Scanner;


public class CambiosDeBase {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        int decimal=0;
        
        System.out.println("Ingrese un número binario de no más de 16 dígitos: ");
        String binario = entrada.nextLine();
        System.out.println("El número ingresado: " + binario);
       
        int longitud = binario.length();
        int[] numeroBinario = new int[longitud];
       
        for (int i = 0; i < longitud; i++) {
            numeroBinario[i] = Character.getNumericValue(binario.charAt(i));
        }
        
        for (int i = 0; i < longitud/2; i++) {
            int aux = numeroBinario[i];
            numeroBinario[i] = numeroBinario[numeroBinario.length - 1 - i];
            numeroBinario[numeroBinario.length - 1 - i] = aux;
        }
        
        for (int i = 0; i < longitud; i++) {
            decimal += (Math.pow(2, i))*numeroBinario[i];
        }
        
        for (int i = 0; i < longitud; i+=3) {
            int j = numeroBinario[i];
        }
        
       
     
        System.out.println("En decimal es: " + decimal);
        
    }
    
}
   
