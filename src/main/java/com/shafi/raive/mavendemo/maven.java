package com.shafi.raive.mavendemo;

import java.sql.Connection;
import org.hibernate.Session;

/**
 *
 * @author shafi
 */
public class maven {

    public maven() {
        System.out.println("Shafi raive");
        
        Session openSession = HibernateUtil.getSessionFactory().openSession();
        System.out.println(openSession);
        
        //Connection connection = ConnectionSingleton.getConnection();
    }
    
    public static void main(String[] args) {
        new maven();
        
    }
    
}
