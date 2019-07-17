package com.shafi.raive.mavendemo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author shafi
 */
public interface crudDao<T, I> {
    
     void create (T t);
    List<T> retrieve();
    T retrieve(I id);
    
}
