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
public class THashBasico implements IHash{

    @Override
    public int calcularHash(String unaClave, int tableSize) {
        int hashVal = 0;
        
        for (int i = 0; i < unaClave.length(); i++){
            hashVal = (hashVal * 128 + unaClave.charAt(i) % tableSize);
        }
        return hashVal;
    }
    
}
