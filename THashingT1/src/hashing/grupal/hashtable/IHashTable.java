/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing.grupal.hashtable;

/**
 *
 * @author Inaki
 */
public interface IHashTable {
    public int buscar(int unaClave);
    public int insertar(int unaClave);
    public int funcionHashing(int unaClave);
}
