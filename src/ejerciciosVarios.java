public class ejerciciosVarios {

    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("El dia 1 es lunes");
                break;
            case 2:
                System.out.println("El dia 2 es martes");
                break;
            case 3:
                System.out.println("El dia 3 es miercoles");
                break;
            //otros casos posibles..
            default:
                System.out.println("Dia no válido");
        }
    }
}