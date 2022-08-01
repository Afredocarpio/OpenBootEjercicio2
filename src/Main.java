import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner num = new Scanner(System.in);
        System.out.println("ingrese cualquier numero Positivo o Negativo: ");
        int numeroif = num.nextInt();*/

        /*Paso 1*/
        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

        int numeroif = 21;

       if (numeroif > 0){
           System.out.println("El numero es Positivo: "+ numeroif);
       } else if (numeroif < 0) {
           System.out.println("El numero es Negativo: "+ numeroif);
       }else {
           System.out.println("El numero es Cero");
       }

        /*Paso 2*/
        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        * Incrementar el valor de la variable en uno cada vez que se ejecute.
        * Mostrarlo por pantalla cada vez que se ejecute.*/

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("Respuesta While : " + numeroWhile);
            numeroWhile++;
        }

        /*Paso 3*/
        /*Para el bucle Do While, deberás crear la misma estructura que en el While,
        pero solo se debe ejecutar una vez.*/

        int numDoWhile = 2;
        do {
            System.out.println("Respuesta DoWhile : " + numDoWhile);
            numDoWhile++;
        }
        while (numDoWhile < 3);

        /*Paso 3*/
        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
        y su condición será que la variable sea igual o menor que 3,
         se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Respuesta For: " + numeroFor);
        }

        /*Paso Cuatro*/
        /*Por último, para el Switch, deberás crear la variable estacion,
         y distintos case para las cuatro estaciones del año.
         Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
         de la estación en la que está. También habrá que poner un default para cuando el valor de la variable
         no sea una estación.*/

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
