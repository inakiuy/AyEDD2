/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenerico;

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
public class TArbolGenericoTest {
    
    public TArbolGenericoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of insertar method, of class TArbolGenerico.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolGenerico instance = new TArbolGenerico();
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TArbolGenerico.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TArbolGenerico instance = new TArbolGenerico();
        instance.eliminar(unaEtiqueta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolGenerico.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolGenerico instance = new TArbolGenerico();
        INodoArbolGenerico expResult = null;
        INodoArbolGenerico result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TArbolGenerico.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolGenerico instance = new TArbolGenerico();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TArbolGenerico.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        TArbolGenerico instance = new TArbolGenerico();
        String expResult = "";
        String result = instance.preOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrden method, of class TArbolGenerico.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        TArbolGenerico instance = new TArbolGenerico();
        String expResult = "";
        String result = instance.postOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class TArbolGenerico.
     */
    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolGenerico instance = new TArbolGenerico();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class TArbolGenerico.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        TArbolGenerico instance = new TArbolGenerico();
        INodoArbolGenerico expResult = null;
        INodoArbolGenerico result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
