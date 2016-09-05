/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing.grupal.hashtable;

import java.util.LinkedList;

/**
 *
 * @author Inaki
 */
public class THashTable implements IHashTable{
    /**
     * Atributes
     ******************************************/
    private IHash hashGenerator;
    private LinkedList<Integer>[] mapa;

    /**
     * Constructor
     ******************************************/
    public THashTable(IHash hashGenerator, int arraySize){
        this.hashGenerator = hashGenerator;
        this.mapa = new LinkedList[arraySize];
        for (int i = 0; i < mapa.length; i++){
            mapa[i] = new LinkedList<Integer>();
        }
    }
        
     /**
     * Methods
     ******************************************/   
       
    @Override
    public int buscar(int unaClave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(int unaClave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int funcionHashing(int unaClave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
