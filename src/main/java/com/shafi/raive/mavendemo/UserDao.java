package com.shafi.raive.mavendemo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author shafi
 */
public class UserDao implements crudDao<User, Long> {

    @Override
    public void create(User user) {
        
        Session session = null;
        Transaction transaction = null; 
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
         
        }catch(Exception e){
            e.printStackTrace();
            if(transaction != null)
            transaction.rollback();
        }finally{
            if(session != null)
            session.close();
        }
        
    }

    @Override
    public List<User> retrieve() {
        
        Session session = null;
     
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            
            Query<User> query = session.createQuery("from User", User.class);
            return query.getResultList();
           
         
        }catch(Exception e){
            e.printStackTrace();
           
        }finally{
            if(session != null)
            session.close();
        }
        return null;
    }

    @Override
    public User retrieve(Long id) {
        Session session = null;
     
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            
            Query<User> query = session.createQuery("from User where id = :id", User.class);
            query.setParameter("id", id);
            return query.getSingleResult();
           
         
        }catch(Exception e){
            e.printStackTrace();
           
        }finally{
            if(session != null)
            session.close();
        }
        
        return null;
    
    }
    
}
