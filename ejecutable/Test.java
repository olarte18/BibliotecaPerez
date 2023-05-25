package ejecutable;
import controlador.Controlador;
import modelo.Libro ;
import modelo.LibroColeccion;
import vista.VentanaPrincipal;
public class Test{
    public static void main(String[] args) {
    VentanaPrincipal miVentana = new VentanaPrincipal();
    Libro miLibro= new Libro();
    Controlador miControlador = new Controlador(miVentana, miLibro);
    }

}