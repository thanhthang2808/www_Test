package com.iuh.fit.se.maithanhthang.ids;

import com.iuh.fit.se.maithanhthang.models.Order;
import com.iuh.fit.se.maithanhthang.models.Product;

import java.io.Serializable;

public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
