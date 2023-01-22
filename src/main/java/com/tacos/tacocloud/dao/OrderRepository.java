package com.tacos.tacocloud.dao;

import com.tacos.tacocloud.model.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
