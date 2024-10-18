import clases.Libro;
import clases.Prestamo;

public class Aplicacion {
    public static void main(String[] args) {
        //libros
        Libro libro1 = new Libro("perro", "teniente bello", 15.00);
        Libro libro2 = new Libro("zona", "gato con botas", 11.50);

        //personas
        Prestamo prestamo1 = new Prestamo("'matias'", true );
        Prestamo prestamo2 = new Prestamo("'hector'", true );
        Prestamo prestamo3 = new Prestamo("'naty'", false );
        Prestamo prestamo4 = new Prestamo();
        Prestamo prestamo5 = new Prestamo();

        //vincular libro al prestamista
        prestamo3.agregarlibro(libro1);
        prestamo3.agregarlibro(libro2);
        
        //imprime informacion
        System.out.println(prestamo3.mostrardetalles() + ", estatus del prestamo: " + prestamo3.retornarestatus());
        System.out.println(prestamo2.mostrardetalles() + ", estatus del prestamo: " + prestamo1.retornarestatus());
    }
}
