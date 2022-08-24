import java.util.Scanner;

public class CreacionYUsoDeMetodos {

    public static void main(String [] args){

        ColeccionDeLibros();

    }

    public static void ColeccionDeLibros(){

       String deseaAgregarLibro = entrada();
       char libros[][] = CrearColeccionDeLibros();
       char libro[] = BuscarLibro(libros);
       MostrarLibro();
       MostrarEspaciosUsados();
       MostrarEspaciosDisponibles();
       MostrarTodaLaColeccion();


    }
    private static String entrada(){

        Scanner teclado = new Scanner(System.in);
        String deseaAgregarLibro = teclado.nextLine();

        return deseaAgregarLibro;
    }


    private static char[][] CrearColeccionDeLibros(){

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
