import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int ceros=0;
        int positivos=0;
        int negativos=0;
        int SumaPositivos = 0;
        int SumaNegativos = 0;


        for (int i =0; i < 10; i++)
        {

            System.out.println("Introduce un numero");

             int numero = sc.nextInt();


           if (numero==0)
               ceros++;
            else {
               if (numero < 0) {
                   positivos++;
                   SumaPositivos += numero;
               }else{
                   if (numero >0)
                       negativos++;
                   SumaNegativos+=numero;
               }
           }

        }
        double MediaPositivos = SumaPositivos / positivos;
        double MediaNegativos = SumaNegativos / negativos;

        System.out.println("La media de los numeros positivos introducidos es: " +MediaPositivos);
        System.out.println("La media de numeros negativos introducidos es: " +MediaNegativos);
        System.out.println("El numero de ceros introducido es: " +ceros);
    }}
