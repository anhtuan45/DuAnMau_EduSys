/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import java.util.List;

/**
 *
 * @author asus
 */
public abstract class EduSysDAO<E,K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(K key);
    abstract public List<E> selectAll();
    abstract public void selectById(K key);
    abstract protected List<E> selectBySql(String sql,Object...args);
    
    
}
