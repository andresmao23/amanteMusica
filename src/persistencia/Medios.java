package persistencia;

import excepciones.PersistenciaException;
import java.util.Vector;
import objetosNegocio.Medio;

/**
 *
 * @author asus
 */
public class Medios {
    
    protected Medio []medios;
    protected int numMedios = 0;
    
    public int indice(Medio medio){
        for (int i = 0; i < numMedios; i++) {
            if(medio.equals(medios[i])) return i;
        }
        return -1;
    }
    
    public Medio obten(Medio medio){
        int pos = indice(medio);
        
        if(pos <= 0) return medios[pos];
        
        return null;
    }
    
    public void agrega(Medio medio) throws PersistenciaException {
        if(numMedios >= medios.length)
            throw new PersistenciaException("Arreglo lleno");
        
        medios[numMedios] = medio;
        numMedios++;
    }
    
    public void actualiza(Medio medio) throws PersistenciaException {
        int pos = indice(medio);
        
        if(pos < 0)
            throw new PersistenciaException("Medio inexistente");
        
        medios[pos] = medio;
    }
    
    public void elimina(Medio medio) throws PersistenciaException {
        int pos = indice(medio);
        
        if(pos < 0)
            throw new PersistenciaException("La canción o película no existe");
        
        medios[pos] = null;
        empaca();
    }

    private void empaca() {
        for (int i = 0; i < numMedios; i++) {
            if(medios[i] == null){
                for (int j = i; j < numMedios-1; j++) {
                    medios[j] = medios[j+1];
                }
                numMedios--;
            }
        }
    }
    
    public Vector lista(){
        Vector lista = new Vector();
        for (int i = 0; i < numMedios; i++) {
            lista.add(medios[i]);
        }
        return lista;
    }
    
    public Vector listaTitulo(String titulo){
        Vector lista = new Vector();
        for (int i = 0; i < numMedios; i++) {
            if(titulo.equals(medios[i].getTitulo()))
                lista.add(medios[i]);
        }
        return lista;
    }
    
    public Vector listaGenero(String cveGenero){
        Vector lista = new Vector();
        for (int i = 0; i < numMedios; i++) {
            if(cveGenero.equals(medios[i].getGenero().getCveGenero()))
                lista.add(medios[i]);
        }
        return lista;
    }
    
}
