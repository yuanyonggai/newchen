package com.ancs.core.service.impl;

import java.io.Serializable;
import java.util.List;

import com.ancs.core.service.IBaseManager;

public abstract class BaseManager<T, K extends Serializable> extends RootManager<T, K>
  implements IBaseManager<T, K>
{
  private Class<T> entityClass;

  public BaseManager()
  {
    this.entityClass = getGenericClass(getClass());
  }

  public void setEntityClass(Class<T> entityClass) {
    this.entityClass = entityClass;
  }

  public void save(T instance) {
    getHibernateTemplate().saveOrUpdate(instance);
  }

  public List<T> findAll() {
    return getHibernateTemplate().loadAll(this.entityClass);
  }

  public T get(K id) {
    return getHibernateTemplate().get(this.entityClass, id);
  }

  public void remove(T instance) {
    getHibernateTemplate().delete(instance);
  }

  public void removeById(K id) {
    getHibernateTemplate().delete(get(id));
  }

  public List<T> findByExample(T instance) {
    return getHibernateTemplate().findByExample(instance);
  }

  public List<T> findByExample(T instance, int firstResult, int maxResults) {
    return getHibernateTemplate().findByExample(instance, firstResult, 
      maxResults);
  }
}