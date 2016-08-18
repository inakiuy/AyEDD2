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
public interface IArbolGenerico <T>{
    
    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operaci�n
     */
    public boolean insertar(INodoArbolGenerico<T> unElemento);
    
    /**
    * Elimina un elemento dada una etiqueta.
    * @param unaEtiqueta 
    */
    public void eliminar(Comparable unaEtiqueta);    

    /**
     * Busca un elemento dentro del �rbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public INodoArbolGenerico<T> buscar(Comparable unaEtiqueta);
    
    /**
     * Imprime en InOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String inOrden();
    
    /**
     * Imprime en PreOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String preOrden();

    /**
     * Imprime en PostOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String postOrden();
    
    /**
     * Retorna si el arbol esta vacio
     * @return 
     */
    public boolean esVacio();
    
    /**
     * Obtiene el dato almacenado en el nodo
     * @return 
     */
    public INodoArbolGenerico<T> getRaiz();
}
