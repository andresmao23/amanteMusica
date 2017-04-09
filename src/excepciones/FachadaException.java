/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author asus
 */
public class FachadaException extends RuntimeException {

    public FachadaException() {
    }
    
    public FachadaException(String msj) {
        super(msj);
    }

    public FachadaException(String msj, Throwable causa) {
        super(msj, causa);
    }
    
    public FachadaException(Throwable causa) {
        super(causa);
    }
    
}
