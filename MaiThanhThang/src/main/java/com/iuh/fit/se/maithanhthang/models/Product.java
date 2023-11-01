package com.iuh.fit.se.maithanhthang.models;

import jakarta.persistence.*;
import com.iuh.fit.se.maithanhthang.enums.ProductStatus;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "product")
@NamedQueries(value = {
        @NamedQuery(name = "Product.findAll", query = "select p from Product p where p.status = ?1"),
        @NamedQuery(name = "Product.findById", query = "select p from Product p where p.product_id = ?1")
        //,...1
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long product_id;
    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "description", length = 250, nullable = false)
    private String description;
    @Column(name = "unit", length = 25, nullable = false)
    private String unit;
    @Column(name = "manufacturer_name", length = 100, nullable = false)
    private String manufacturer;

    @Column(name = "status")
    private ProductStatus status;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//    @JoinColumn
    private List<ProductImage> productImageList = new ArrayList<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//    @JoinColumn
    private List<OrderDetail> orderDetails = new ArrayList<>();
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//    @JoinColumn
    private List<ProductPrice> productPrices = new ArrayList<>();

    public Product() {
    }

    public Product(String name, String description, String unit, String manufacturer, ProductStatus status) {
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturer = manufacturer;
        this.status = status;
    }

    public void setProduct_id(long id) {
        this.product_id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public void setProductImageList(List<ProductImage> productImageList) {
        this.productImageList = productImageList;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void setProductPrices(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", status=" + status +
                '}';
    }


}
