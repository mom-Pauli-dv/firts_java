public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
    }
}

class OtroMain {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a screen match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.8 + 9.8) / 3;
        System.out.println(media);

        // Necesitas declarar e inicializar
        // fechaDeLanzamiento dentro del método main de OtroMain
        String sinopsis = """
                MATRIX ES UNA PARADOJA LA MEJOR PELICULA DE
                TODOS LOS TIEMPOS
                fue lanzada en :
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

        String nombre ="Paulina Bonita";
        String saludo = "Hola amor ";
        String mensaje = saludo + nombre;
        System.out.println(mensaje);

        String contrasena = "123456";
        if(contrasena.equals ("123456") ){
            System.out.println("Acceso Autorizado!");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        String name ="Maria";
        int edad = 50;
        double valor = 55.000;
        System.out.println(String.format("mi name es %s, tengo %s años y hoy gaste %s.2f  dolares", name,edad, valor));
    }
} /*holo*/
/* esto es un loco comentario*/

