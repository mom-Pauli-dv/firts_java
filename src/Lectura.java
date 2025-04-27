import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo dinos que nota le das a la pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}

//public class EjemploScanner {
// public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese nombre: ");
//        String nombre = scanner.nextLine();
//
//        System.out.println("ingrese su edad: ");
//        int edad = scanner.nextInt();
//
//        System.out.println("Ingrese valor que pretende invertir este mes: ");
//        double valor = scanner.nextDouble();
//
//        System.out.println(nombre + "que tiene" + edad + "años, invertirá ARS" + valor
//                + "este mes.");
//
//        scanner.close();
//    }
//}


