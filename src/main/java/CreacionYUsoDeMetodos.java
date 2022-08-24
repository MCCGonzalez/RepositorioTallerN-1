import java.util.Scanner;

public class CreacionYUsoDeMetodos {

    public static void main(String [] args){

        ColeccionDeLibros();

    }

    public static void ColeccionDeLibros(){

        int contador = 0;

        Bienvenida();

        int numeroDeLibros = cuantosLibrosDeseaAgreagar();
        char libros[][] = CrearColeccionDeLibros(numeroDeLibros);
        String autor = AgregarAutor();
        String titulo = AgregarTitulo();
        String editorial = AgregarEditorial();
        char libro[] = BuscarLibro(libros);
        MostrarLibro();
        MostrarEspaciosUsados();
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

    private static String  AgregarAutor(){

        Scanner teclado = new Scanner(System.in);
        String autor = teclado.nextLine();

        return autor;
    }

    private static String AgregarTitulo(){

        Scanner teclado = new Scanner(System.in);
        String titulo = teclado.nextLine();

        return titulo;
    }

    private static String AgregarEditorial(){

        Scanner teclado = new Scanner(System.in);
        String editorial = teclado.nextLine();

        return editorial;
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
