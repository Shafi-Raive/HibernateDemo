/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shafi.raive.mavendemo.test;

import com.shafi.raive.mavendemo.subUser;
import com.shafi.raive.mavendemo.subUserDao;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author shafi
 */
public class subUserDaoTest {
    
    public subUserDaoTest() {
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
     * Test of create method, of class subUserDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        subUser t = new subUser(1, "shafi@", "12345");
        subUserDao instance = new subUserDao();
        instance.create(t);
        
    }

    /**
     * Test of retrieve method, of class subUserDao.
     */
    @Test
    @Ignore
    public void testRetrieve_0args() {
        System.out.println("retrieve");
        subUserDao instance = new subUserDao();
        List<subUser> expResult = null;
        List<subUser> result = instance.retrieve();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieve method, of class subUserDao.
     */
    @Test
    @Ignore
    public void testRetrieve_String() {
        System.out.println("retrieve");
        String id = "";
        subUserDao instance = new subUserDao();
        subUser expResult = null;
        subUser result = instance.retrieve(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
