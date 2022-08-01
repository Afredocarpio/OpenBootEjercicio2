import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner num = new Scanner(System.in);
        System.out.println("ingrese cualquier numero Positivo o Negativo: ");
        int numeroif = num.nextInt();*/

        /*Paso 1*/
        int numeroif = 21;

       if (numeroif > 0){
           System.out.println("El numero es Positivo: "+ numeroif);
       } else if (numeroif < 0) {
           System.out.println("El numero es Negativo: "+ numeroif);
       }else {
           System.out.println("El numero es Cero");
       }

        /*Paso 2*/
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("Respuesta While : " + numeroWhile);
            numeroWhile++;
        }

        /*Paso 3*/

        int numDoWhile = 2;
        do {
            System.out.println("Respuesta DoWhile : " + numDoWhile);
            numDoWhile++;
        }
        while (numDoWhile < 3);

        /*Paso 3*/
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Respuesta For: " + numeroFor);
        }

        /*Paso Cuatro*/

        String estacion = "primavera";
        switch (estacion) {
            case "verano":
                System.out.println("Es Verano");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "otono":
                System.out.println("Es Oto#o");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una Estacion");
        }


    }
}
