package com.iuh.fit.se.maithanhthang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iuh.fit.se.maithanhthang.models.Order;
import com.iuh.fit.se.maithanhthang.models.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Order> {
}