package com.iuh.fit.se.maithanhthang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iuh.fit.se.maithanhthang.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}