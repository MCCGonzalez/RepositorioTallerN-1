import java.util.Scanner;

public class CreacionYUsoDeMetodos {

    public static void main(String [] args){

        ColeccionDeLibros();

    }

    public static void ColeccionDeLibros(){


        Bienvenida();

        int numeroDeLibros = cuantosLibrosDeseaAgreagar();
        char libros[][] = CrearColeccionDeLibros(numeroDeLibros);
        MensajeLibros();
        String[][] datosLibros = AgregarDatos(numeroDeLibros);
        char libro[] = BuscarLibro(libros);
        MostrarLibro();
        MostrarEspaciosUsados(numeroDeLibros);
        MostrarEspaciosDisponibles();
        MostrarTodaLaColeccion();



    }
    private static void  Bienvenida(){

        System.out.println("Bienvenido a mi programa, para empezar ingresar un libro ingrese un numero mayor a 0");
    }

    private static int cuantosLibrosDeseaAgreagar(){

        Scanner teclado = new Scanner(System.in);
        int numeroDeLibros = Integer.valueOf(teclado.nextLine());

        return numeroDeLibros;
    }

    private static char[][] CrearColeccionDeLibros(int numeroDeLibros){

        return new char [3][numeroDeLibros];

    }

    private static void MensajeLibros(){

        System.out.println("ingrese en el siguiente orden: ");
        System.out.println("Autor");
        System.out.println("titulo");
        System.out.println("editorial");
    }

    private static String[][]  AgregarDatos(int numeroDeLibros){

        Scanner teclado = new Scanner(System.in);
        String datosLibros[][] = new String[numeroDeLibros][3];
        for( int i = 0; i < numeroDeLibros; i++ ) {

            for (int j = 0; j < 3; j++) {

                datosLibros[i][j] = teclado.nextLine();

            }
        }
        return datosLibros;
    }


    private static char[] BuscarLibro(char[][] libros){

         return new char[3];
    }

    private static void MostrarLibro(){


    }

    private static void MostrarEspaciosUsados(int numeroDeLibros){

        System.out.println("espacios usados: " + numeroDeLibros);


    }

    private static void MostrarEspaciosDisponibles(){


    }

    private static void MostrarTodaLaColeccion(){



    }


}
