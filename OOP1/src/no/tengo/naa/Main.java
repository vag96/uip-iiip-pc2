package no.tengo.naa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Articulo> inventario = new ArrayList<>(); //Listas

        while (opcion != 9) {               //muestra el menu
            System.out.println("¡Bienvenido a No Tengo Naa!");
            System.out.println("SISTEMA DE INVENTARIO - MENÚ");
            System.out.println("1. Consultat\n2. Añadir\n3. Borrar\n4. Salir");
            System.out.print("OPCION: ");
            try {               //abre las excepciones, y verifica error
                opcion = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("NO FUNCIONA EL TECLADO");
            } catch (Exception e) {
                System.out.println("ERROR DESCONOCIDO");
            }

            switch (opcion) { //inicio de menu
                case 1:
                    break;
                case 2:
                    String i,n;
                    double p, pu;
                    int c;
                    do {    //para cuando salga un dato malo lo vuelva a repetir
                        try {
                            System.out.print("ID: ");
                            i = br.readLine();
                        } catch (Exception e) {
                            System.out.println("Algun dato esta mal"); }
                    } while (i.equals(" ")&& i.equals("-"));
                    do{
                    try {
                        System.out.print ("Nombre: ");
                         n = br.readLine();
                    } catch (Exception e) {
                        System.out.println("Algun dato esta mal"); }
                    }
                    while (i.equals(" ") && i.equals(" ")&& i.equals("-"));
                    do {
                        try {
                            System.out.print("Peso: ");
                            p = Double.parseDouble(br.readLine());
                        } catch (Exception e) {
                            System.out.println("Algun dato esta mal");
                        }
                    } while (p <=0);
                    do{
                    try{
                        System.out.print ("Precio Unicario: ");
                        pu = Double.parseDouble(br.readLine());
                    } catch ( Exception e ) {
                    System.out.println("Algun dato esta mal");
                    }
                    } while (pu=)
                    try {
                        System.out.print ("Cantidad: ");
                        c = Integer.parseInt(br.readLine())
                    }  catch ( Exception e ) {
                        System.out.println("Algun dato esta mal");
                    }

                    Articulo a=new Articulo (id: "a001", nombre: "Tornillo", peso: 2.5, precioUnitario: 0.05, cantidad: 50);
                    // se crea un objeto de tipo artulo (declaracion de variables
                    inventario.add();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERROR :: Opción inválida.");
                    break;
            }
        }

        System.out.println("Vamos pa lante!");
    }
}

