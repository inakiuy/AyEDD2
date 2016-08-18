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
public class TNodoArbolGenericoTest {
    
    public TNodoArbolGenericoTest() {
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
     * Test of insertar method, of class TNodoArbolGenerico.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TNodoArbolGenerico instance = null;
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TNodoArbolGenerico.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TNodoArbolGenerico instance = null;
        INodoArbolGenerico expResult = null;
        INodoArbolGenerico result = instance.eliminar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TNodoArbolGenerico.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TNodoArbolGenerico instance = null;
        INodoArbolGenerico expResult = null;
        INodoArbolGenerico result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TNodoArbolGenerico.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        String listInOrder = "";
        TNodoArbolGenerico instance = null;
        instance.inOrden(listInOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TNodoArbolGenerico.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        String listPreOrder = "";
        TNodoArbolGenerico instance = null;
        instance.preOrden(listPreOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrden method, of class TNodoArbolGenerico.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        String listPostOrder = "";
        TNodoArbolGenerico instance = null;
        instance.postOrden(listPostOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDato method, of class TNodoArbolGenerico.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        TNodoArbolGenerico instance = null;
        Object expResult = null;
        Object result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtiqueta method, of class TNodoArbolGenerico.
     */
    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        TNodoArbolGenerico instance = null;
        Comparable expResult = null;
        Comparable result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimerHijo method, of class TNodoArbolGenerico.
     */
    @Test
    public void testGetPrimerHijo() {
        System.out.println("getPrimerHijo");
        TNodoArbolGenerico instance = null;
        INodoArbolGenerico expResult = null;
        INodoArbolGenerico result = instance.getPrimerHijo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguienteHermano method, of class TNodoArbolGenerico.
     */
    @Test
    public void testGetSiguienteHermano() {
        System.out.println("getSiguienteHermano");
        TNodoArbolGenerico instance = null;
        INodoArbolGenerico expResult = null;
        INodoArbolGenerico result = instance.getSiguienteHermano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrimerHijo method, of class TNodoArbolGenerico.
     */
    @Test
    public void testSetPrimerHijo() {
        System.out.println("setPrimerHijo");
        TNodoArbolGenerico instance = null;
        instance.setPrimerHijo(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSiguienteHermano method, of class TNodoArbolGenerico.
     */
    @Test
    public void testSetSiguienteHermano() {
        System.out.println("setSiguienteHermano");
        TNodoArbolGenerico instance = null;
        instance.setSiguienteHermano(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
