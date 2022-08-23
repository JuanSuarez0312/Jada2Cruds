/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.jada2webaplication.bean;

import com.jada2webaplication.entity.Rol;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juans
 */
public class RolBeanTest {
    
    public RolBeanTest() {
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
     * Test of init method, of class RolBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        RolBean instance = new RolBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoles method, of class RolBean.
     */
    @Test
    public void testGetRoles() {
        System.out.println("getRoles");
        RolBean instance = new RolBean();
        List<Rol> expResult = null;
        List<Rol> result = instance.getRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoles method, of class RolBean.
     */
    @Test
    public void testSetRoles() {
        System.out.println("setRoles");
        List<Rol> roles = null;
        RolBean instance = new RolBean();
        instance.setRoles(roles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
