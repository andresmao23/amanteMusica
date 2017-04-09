package objetosNegocio;

/**
 *
 * @author asus
 */
public class Cancion extends Medio{
    
    private String interprete;
    private String autor;
    private String album;

    public Cancion() {
        super();
    }

    public Cancion(String interprete, String autor, String album, String clave, String titulo, Genero genero, int duracion) {
        super(clave, titulo, genero, duracion);
        this.interprete = interprete;
        this.autor = autor;
        this.album = album;
    }
    
    public Cancion(String clave){
        this(null, null, null, clave, null, null, 0);
    }

    //Métodos getter y setter
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + interprete + ", " + autor + ", " + album;
    }
    
}
