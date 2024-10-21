package org.example.ISP.Service;

import org.example.ISP.entity.Entity;
import org.example.ISP.entity.User;

import java.util.List;

public interface PersistenceService <T extends Entity >{
    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);

}
