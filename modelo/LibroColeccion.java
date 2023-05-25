package modelo;

public class LibroColeccion extends Libro
{
    private String nombreColeccion;
    private int numeroCollecion;
    public LibroColeccion(String nombreAutor,String nombreLibro, int añoEdicion, Boolean  edicionLujo, String nombreColeccion, int numeroCollecion)
    {
        super(nombreAutor,nombreLibro,añoEdicion,edicionLujo);
        this.nombreColeccion=nombreColeccion;
        this.numeroCollecion=numeroCollecion;
    }
    public String getNombreColeccion() {
        return nombreColeccion;
    }
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    public int getNumeroCollecion() {
        return numeroCollecion;
    }
    public void setNumeroCollecion(int numeroCollecion) {
        this.numeroCollecion = numeroCollecion;
    }
    @Override
    public String toString() {
        return "Libro \nnombreAutor=" + getNombreAutor() + "\nnombreLibro=" + getNombreLibro() + "\nañoEdicion=" + getAñoEdicion()
            + "\nedicionLujo=" +getEdicionLujo()+ "\nColeccion: "+getNombreColeccion()+"\nNumeroColeccion: "+getNumeroCollecion();
    }
}
