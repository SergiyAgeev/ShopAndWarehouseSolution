package com.shopandwarehousesolution.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 20)
    private String city;
    @Column(nullable = false, length = 50)
    private String adress;
    @Column(nullable = false, length = 10)
    private int phoneNumberOfShop;
    @Column(nullable = false, length = 30)
    private String director;
    @Column(nullable = false, length = 100)
    private int numberOfWorkers;

    @OneToOne(mappedBy = "shop_id", cascade=CascadeType.ALL)
//    private Set<StockShop> stockShop = new HashSet<StockShop>();

    private StockShop stockShop;


    public Shop() {
    }

    public Shop(String city, String adress, int phoneNumberOfShop, String director, int numberOfWorkers) {
        this.city = city;
        this.adress = adress;
        this.phoneNumberOfShop = phoneNumberOfShop;
        this.director = director;
        this.numberOfWorkers = numberOfWorkers;
    }

//    public Set<StockShop> getStockShop() {
//        return stockShop;
//    }
//
//    public void setStockShop(Set<StockShop> stockShop) {
//        this.stockShop = stockShop;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumberOfShop() {
        return phoneNumberOfShop;
    }

    public void setPhoneNumberOfShop(int phoneNumberOfShop) {
        this.phoneNumberOfShop = phoneNumberOfShop;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumberOfShop=" + phoneNumberOfShop +
                ", director='" + director + '\'' +
                ", numberOfWorkers=" + numberOfWorkers +
                '}';
    }
}
