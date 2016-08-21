/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
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
    
    public VectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("START setUpClass()");
        v1_OK = new int[] {0,1,2,3,4,5};
        v2_ERR_Order = new int[] {0,1,3,2,4,5};
        v3_ERR_Null = new int[6];
        System.out.println("END setUpClass()");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of BusquedaLineal method, of class Vector.
     */
    @Test
    public void testBusquedaLineal() {
        System.out.println("BusquedaLineal");
        int srch = 0;
        Vector instance = null;
        boolean expResult = false;
        boolean result = instance.BusquedaLineal(srch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaBinaria method, of class Vector.
     */
    @Test
    public void testBusquedaBinaria() {
        System.out.println("BusquedaBinaria");
        int srch = 0;
        Vector instance = null;
        boolean expResult = false;
        boolean result = instance.BusquedaBinaria(srch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
