package com.iuh.fit.se.maithanhthang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iuh.fit.se.maithanhthang.models.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}