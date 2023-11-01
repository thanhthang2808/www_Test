package com.iuh.fit.se.maithanhthang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iuh.fit.se.maithanhthang.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}