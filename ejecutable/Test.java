package ejecutable;
import modelo.Libro ;
import modelo.LibroColeccion;;
public class Test{
    public static void main(String[] args) {
        Libro libro1=new Libro("jorge", "solo", 2004, false);
        System.out.println(libro1);
        LibroColeccion libroc= new LibroColeccion("luis", "las mariposas no lloran", 2005 , true, "mariposas", 2);
        System.out.println(libroc);
    }

}