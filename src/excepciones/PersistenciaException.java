
package excepciones;

/**
 *
 * @author asus
 */
public class PersistenciaException extends RuntimeException {
    
    public PersistenciaException(){
        
    }
    
    public PersistenciaException(String msj){
        super(msj);
    }

    public PersistenciaException(String msj, Throwable causa) {
        super(msj, causa);
    }
    
    public PersistenciaException(Throwable causa) {
        super(causa);
    }
    
}
