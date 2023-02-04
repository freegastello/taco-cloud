package com.tacos.tacocloud.dao;

import com.tacos.tacocloud.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
