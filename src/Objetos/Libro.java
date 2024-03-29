package Objetos;
public class Libro {
    private Integer ISBN;
    private int anio;
    private String idioma;
    private String titulo;
    private String editorial;
    private String autor;
    private int edicion;
    private String categoria;
    private long carneUsuario;//JMM
    
    public Libro(){}
    
    public Libro(int ISBN){
        this.ISBN=ISBN;
        this.titulo="";
        this.autor="";
        this.editorial="";
        this.anio=0;
        this.edicion=0;
        this.categoria="";
        this.idioma="";
        this.carneUsuario=0;
    }
    
    public Libro(Integer ISBN, int anio,String idioma,String titulo,String editorial,
            String autor,int edicion,String categoria,long carneUsuario){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.editorial=editorial;
        this.anio=anio;
        this.edicion=edicion;
        this.categoria=categoria;
        this.idioma=idioma;
        this.carneUsuario=carneUsuario;//JMM
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public long getCarneUsuario() {
        return carneUsuario;
    }

    public void setCarneUsuario(long carneUsuario) {
        this.carneUsuario = carneUsuario;
    }
}
