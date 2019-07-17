package com.shafi.raive.mavendemo;

import java.util.List;

/**
 *
 * @author shafi
 */
public interface crudDao<T, I> {
    
    void create (T t);
    List<T> retrieve();
    T retrieve(I id);
    
}
