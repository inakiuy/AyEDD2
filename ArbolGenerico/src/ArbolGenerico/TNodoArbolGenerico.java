/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenerico;

/**
 *
 * @author Inaki
 */
public class TNodoArbolGenerico<T> implements INodoArbolGenerico<T>{

    /**
    * Atributes
    * *****************************************************
    */
    private Comparable etiqueta;
    private INodoArbolGenerico<T> primerHijo;
    private INodoArbolGenerico<T> siguienteHermano;
    private T datos;
    // End Atributes ***************************************
    
    /**
    * Constructors
    * *****************************************************
    */
    /**
     * Constructor of TElementoAB
     * @param unaEtiqueta
     * @param unosDatos
     */
    public TNodoArbolGenerico(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }
    // End Constructors ***************************************
    
    /**
    * Methods
    * ***************************************************** 
    */
    
    
    @Override
    public boolean insertar(INodoArbolGenerico<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INodoArbolGenerico<T> eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INodoArbolGenerico<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inOrden(String listInOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preOrden(String listPreOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postOrden(String listPostOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getDato() {
        return datos;
    }

    @Override
    public Comparable getEtiqueta() {
        return (etiqueta.toString());
    }

    @Override
    public INodoArbolGenerico<T> getPrimerHijo() {
        return primerHijo;
    }

    @Override
    public INodoArbolGenerico<T> getSiguienteHermano() {
        return siguienteHermano;
    }

    @Override
    public void setPrimerHijo(INodoArbolGenerico<T> elemento) {
        this.primerHijo = elemento;
    }

    @Override
    public void setSiguienteHermano(INodoArbolGenerico<T> elemento) {
        this.siguienteHermano = elemento;
    }
    
}
