package com.iuh.fit.se.maithanhthang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iuh.fit.se.maithanhthang.models.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, com.iuh.fit.se.maithanhthang.models.Product> {
}