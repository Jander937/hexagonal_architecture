package org.example.ISP.Service;

import org.example.ISP.entity.Entity;
import org.example.ISP.entity.Order;
import org.example.ISP.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order> {
    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void save(Order entity) {
        synchronized (ORDERS){
            ORDERS.put(entity.getId(),entity);
        }
    }

    @Override
    public void delete(Order entity) {
        synchronized (ORDERS){
            ORDERS.remove(entity.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS){
           return ORDERS.get(id);
        }
    }

}
