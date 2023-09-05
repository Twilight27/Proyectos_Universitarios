package condicional3;
import java.util.Scanner;
public class Condicional3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese tres numeros"); 
        System.out.print("Primer numero: ");
        int valor1 = entrada.nextInt();
        System.out.print("Segundo numero: ");
        int valor2 = entrada.nextInt();
        System.out.print("Tercer numero: ");
        int valor3 = entrada.nextInt ();
        if(valor1 == valor2 && valor1==valor3){
            System.out.println("Los numeros son iguales: " + valor1 + ", "+ valor2+ ", " + valor3);
        }
        else{
            if (valor1 == valor2 && valor2 != valor3){
                System.out.println("Los numeros iguales son: " + valor1 + ", " + valor2);
            }
            else{
                if (valor2 == valor3 && valor3!=1){
                    System.out.println("Los numeros iguales son: " + valor2 + ", " + valor3);
                }
                else{
                    if (valor1 == valor3 && valor3!=valor2){
                        System.out.println("Los numeros iguales son: " + valor1 + ", " + valor3);
                    }
                    else{
                        if (valor1 != valor2 && valor2!=valor3){
                            System.out.println("Los numeros son diferentes: "+ valor1 + " ," + valor2 + " ," + valor3);
                        }
                    }
                }
            }
        }
    }   
}
