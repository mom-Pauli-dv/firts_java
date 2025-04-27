public class Desiciones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //codigo que prueba los operadores relaciones
//        if (fechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas mas populares");
//        }else {
//            System.out.printf("Peliculas Retro que aún vale la pena ver ");
//        }
        //para hacer el or es shift + 1era tecla | |
        // para que se escriba el print: escribe SOUT Y aparece

        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
