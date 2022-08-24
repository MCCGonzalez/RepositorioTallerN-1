import java.util.Scanner;

public class CreacionYUsoDeMetodos {

    public static void main(String [] args){

        ColeccionDeLibros();

    }

    public static void ColeccionDeLibros(){

        int contador = 0;

        Bienvenida();

        int numeroMayorCero = entrada();
        boolean esVerdad = validacion(numeroMayorCero);
        int numeroDeLibros = CantidadDeLibros(esVerdad, contador);
        char libros[][] = CrearColeccionDeLibros(numeroDeLibros);
        char libro[] = BuscarLibro(libros);
        MostrarLibro();
        MostrarEspaciosUsados();
        MostrarEspaciosDisponibles();
        MostrarTodaLaColeccion();



    }
    private static void  Bienvenida(){

        System.out.println("Bienvenido a mi programa, para empezar ingresar un libro ingrese un numero mayor a 0");
    }

    private static int entrada(){

        Scanner teclado = new Scanner(System.in);
        int numeroMayorCero = Integer.valueOf(teclado.nextLine());

        return numeroMayorCero;
    }

    private static boolean validacion(int numeroMayorCero) {

        boolean esVerdad = false;
        if (numeroMayorCero > 0) {

            esVerdad = true;

        }
        return esVerdad;
    }

    private static int CantidadDeLibros(boolean esVerdad, int contador) {

        int numeroDeLibros = 0;
        if (esVerdad = true) {

            numeroDeLibros = contador + 1;

        }
        return numeroDeLibros;
    }


    private static char[][] CrearColeccionDeLibros(int numeroDeLibros){




        return new char[100][3];
    }


    private static char[] BuscarLibro(char[][] libros){

         return new char[1];
    }

    private static void MostrarLibro(){


    }

    private static void MostrarEspaciosUsados(){


    }

    private static void MostrarEspaciosDisponibles(){


    }

    private static void MostrarTodaLaColeccion(){



    }


}
