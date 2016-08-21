/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inaki
 */
public class VectorTest {
    
    static int[] v1_OK;
    static int[] v2_ERR_Order;
    static int[] v3_ERR_Null;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("START setUpClass()");
        v1_OK = new int[] {0,1,2,3,4,5,6,7,8,9};
        v2_ERR_Order = new int[] {0,1,3,2,4,5,6,8,7,9};
        v3_ERR_Null = new int[10];
        System.out.println("END setUpClass()");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of BusquedaLineal method, of class Vector.
     */
    @Test (expected = Exception.class)
    public void testBusquedaLineal() throws Exception {
        System.out.println("BusquedaLineal - Vector OK");
        int srch1 = 0;
        Vector instance1 = new Vector(v1_OK);
        boolean expResult1 = true;
        boolean result1 = instance1.BusquedaLineal(srch1);
        assertEquals(expResult1, result1);
                
        System.out.println("BusquedaLineal - Vector OK - Busqueda no exitosa");
        int srch4 = 11;
        Vector instance4 = new Vector(v1_OK);
        boolean result4 = instance4.BusquedaLineal(srch4);
        assertFalse(result4);
        
        System.out.println("BusquedaLineal - Vector Desordenado");
        int srch2 = 5;
        Vector instance2 = new Vector(v2_ERR_Order);
        boolean expResult2 = true;
        boolean result2 = instance2.BusquedaLineal(srch2);
        assertEquals(expResult2, result2);
        
        System.out.println("BusquedaLineal - Vector no inicializado");
        int srch3 = 5;
        Vector instance3 = new Vector(v3_ERR_Null);
        boolean result3 = instance3.BusquedaLineal(srch3);
    }

    /**
     * Test of BusquedaBinaria method, of class Vector.
     */
    @Test (expected = Exception.class)
    public void testBusquedaBinaria() throws Exception {
        System.out.println("BusquedaBinaria - Exitosa a la izquierda");
        int srch1 = 0;
        Vector instance1 = new Vector(v1_OK);
        boolean result1 = instance1.BusquedaBinaria(srch1);
        assertTrue(result1);
        
        System.out.println("BusquedaBinaria - Exitosa a la derecha");
        int srch2 = 4;
        boolean result2 = instance1.BusquedaBinaria(srch2);
        assertTrue(result2);
        
        System.out.println("BusquedaBinaria - Exitosa al medio");
        int srch3 = 2;
        boolean result3 = instance1.BusquedaBinaria(srch3);
        assertTrue(result3);
        
        System.out.println("BusquedaBinaria - No exitosa");
        int srch4 = 11;
        boolean result4 = instance1.BusquedaBinaria(srch4);
        assertFalse(result4);
        
//        System.out.println("BusquedaBinaria - Array desordenado");
//        Vector instance2 = new Vector(v2_ERR_Order);
//        int srch5 = 5;
//        boolean result5 = instance2.BusquedaBinaria(srch5);
        
        System.out.println("BusquedaBinaria - Array nulo");
        Vector instance3 = new Vector(v3_ERR_Null);
        int srch6 = 6;
        boolean result6 = instance3.BusquedaBinaria(srch6);
    } 
}
