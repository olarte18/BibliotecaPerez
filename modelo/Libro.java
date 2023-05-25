package modelo ;
public class Libro
{
    protected String nombreAutor;
    protected String nombreLibro;
    protected int añoEdicion;
    protected Boolean edicionLujo;


    public Libro(String nombreAutor, String nombreLibro, int añoEdicion, Boolean edicionLujo) {
        this.nombreAutor = nombreAutor;
        this.nombreLibro = nombreLibro;
        this.añoEdicion = añoEdicion;
        this.edicionLujo = edicionLujo;
    }
    public Libro()
    {
        
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public Boolean getEdicionLujo() {
        return edicionLujo;
    }

    public void setEdicionLujo(Boolean edicionLujo) {
        this.edicionLujo = edicionLujo;
    }

    @Override
    public String toString() {
        return "Libro \nnombreAutor=" + getNombreAutor() + "\nnombreLibro=" + getNombreLibro() + "\nañoEdicion=" + getAñoEdicion()
            + "\nedicionLujo=" +getEdicionLujo();
    }

    
}