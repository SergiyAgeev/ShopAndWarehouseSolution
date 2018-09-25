package com.shopandwarehousesolution.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 250, unique = true)
    private String name;
    @Column(nullable = false, length = 250, unique = true)
    private long barcode;
    @Column(nullable = false, length = 200, unique = true)
    private String artykul;
    @Column(nullable = false, length = 100)
    private float price;

    @OneToMany(mappedBy = "product_id", cascade=CascadeType.ALL)
    private Set<StockShop> stockShopts = new HashSet<StockShop>();

    @OneToMany(mappedBy = "product_id", cascade=CascadeType.ALL)
    private Set<WarehouseStock> warehouseStocks = new HashSet<WarehouseStock>();

    private Date date = new Date();

    public Product() {
    }

    public Product(String name, long barcode, String artykul, float price, Date date) {
        this.name = name;
        this.barcode = barcode;
        this.artykul = artykul;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public String getArtykul() {
        return artykul;
    }

    public void setArtykul(String artykul) {
        this.artykul = artykul;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", barcode=" + barcode +
                ", artykul=" + artykul +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
