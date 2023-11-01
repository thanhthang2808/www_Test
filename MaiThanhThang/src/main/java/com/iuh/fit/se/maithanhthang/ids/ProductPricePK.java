package com.iuh.fit.se.maithanhthang.ids;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import com.iuh.fit.se.maithanhthang.models.Product;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductPricePK implements Serializable {
    private Product product;
    private LocalDateTime price_date_time;
}
