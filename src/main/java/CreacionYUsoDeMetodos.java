public class CreacionYUsoDeMetodos {

    public static void main(String [] args){

        ColeccionDeLibros();

    }

    public static void ColeccionDeLibros(){

       char libros[][] = CrearColeccionDeLibros();
       buscarLibro(libros);
       
    }

    private static char[][] CrearColeccionDeLibros(){

        return new char[100][3];
    }

    private static void buscarLibro(char[][] libros){


    }

}
