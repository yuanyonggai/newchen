package com.ancs.core.service;

import java.io.Serializable;
import java.util.List;

public abstract interface IBaseManager<T, K extends Serializable> extends IRootManager<T, K>
{
  public abstract T get(K paramK);

  public abstract void save(T paramT);

  public abstract void remove(T paramT);

  public abstract void removeById(K paramK);

  public abstract List<T> findAll();

  public abstract List<T> findByExample(T paramT);

  public abstract List<T> findByExample(T paramT, int paramInt1, int paramInt2);
}