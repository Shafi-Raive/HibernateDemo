/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shafi.raive.mavendemo.test;

import com.shafi.raive.mavendemo.User;
import com.shafi.raive.mavendemo.UserDao;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shafi
 */
public class UserDaoTest {
    
    public UserDaoTest() {
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
     * Test of create method, of class UserDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        User user = new User(1234l, "shafi", "shafiraive13@gmail.com");
        UserDao instance = new UserDao();
        instance.create(user);
        
    }

    /**
     * Test of retrieve method, of class UserDao.
     */
    @Test
    public void testRetrieveAll() {
        System.out.println("retrieve all User");
        UserDao instance = new UserDao();
        User user = new User(1234l, "shafi", "shafiraive13@gmail.com");
        User user2 = new User(1589l, "raive", "shafiraive13@gmail.com");
        instance.create(user);
        instance.create(user2);
        List<User> userList = instance.retrieve();
        assertEquals(2, userList.size());
        assertEquals(user, userList.get(0));
        assertEquals(user2, userList.get(1));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieve method, of class UserDao.
     */
    @Test
    public void testRetrieveById() {
        System.out.println("retrieve By id");
         UserDao instance = new UserDao();
         Long longId = 26584l;
        User user1 = new User(longId, "noman", "noman@gmail.com");
        instance.create(user1);
        User user2 = instance.retrieve(longId);
        assertEquals(user1, user2);
        
    }
    
}
