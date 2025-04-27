import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        //generar numero aleatorio 0 a 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); //limite superior

        //inicializar scanner
        Scanner scanner = new Scanner(System.in);

        //numero maximo de intentos
        int maxIntentos = 5;
        int intentoActual = 0;
        int numeroUsuario;
        boolean adivinado = false;

        System.out.println("Bienvenidos a las adivinanzas");
        System.out.println("Adivina el numero secreto entre 0 a 100");
        System.out.println("Tienes" +  maxIntentos  + "intentos.");

        while (intentoActual < maxIntentos){
            intentoActual++;
            System.out.println("intento" + intentoActual + ": Ingresa tu numero");
            numeroUsuario = scanner.nextInt();

            if(numeroUsuario == numeroAleatorio){
                System.out.println("Felicidades! adivinaste el numero en " + intentoActual + "intentos.");
                adivinado = true;
                break; //salir del bucle si adivina
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El numero secreto es mayor");
            }else {
                System.out.println("El numero secreto es menor");
            }
        }
        //si adivinas despues de todos los intentos
        if(!adivinado){
            System.out.println("\n¡Se acabaron los intentos! El numero secreto era: " + numeroAleatorio);
        }
        //cerrar scanner para liberar los recursos
        scanner.close();

    }
}
