package com.shafi.raive.mavendemo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author shafi
 */
public abstract class crudMysqlDaoImple<T, I> implements crudDao<T, I> {

    @Override
    public void create(T t) {
        Session session = null;
        Transaction transaction = null; 
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(t);
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
    public List<T> retrieve() {
         Session session = null;
         T t = null;
     
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            
            Query<T> query = null;
            session.createQuery("from subUser", t.getClass());
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
    public T retrieve(I id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
