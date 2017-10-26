package com.company;
import java.util. Scanner;

public class Main {

    public static void main(String args[])  {
        Scanner lee = new Scanner(System.in);
        int year, salir;
        Boolean x=true;

        while (x==true){
        //Imprimir Mensajes
        System.out.print("Hola, vamos a calcular años bisiestos\n\n");
        System.out.print("Por favor, introduzca un año: ");
        year = lee.nextInt();


        if ((year % 4 == 0 ) && (year % 100 != 0 ) && (year % 400 == 0 ) )
        {
            System.out.print("\n" + year + ", es bisiesto yuju. \n\n");
        }
        else {
            System.out.print(year +", no es bisiesto :( ");
        }
            System.out.print ( "\n\n Quiere seguir calculando? \n\n 1=si           2=no ");
            salir = lee.nextInt();
            if(salir==2){
                System.out.print("Ok, chao!");
                x=false;}
        }
    }
}
