package com.shopandwarehousesolution.entity;

import javax.persistence.*;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
@Entity
public class WareHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 20)
    private String sity;
    @Column(nullable = false, length = 50)
    private String adress;
    @Column(nullable = false, length = 10)
    private int phoneNumberOfWarehouse;
    @Column(nullable = false, length = 30)
    private String director;
    @Column(nullable = false, length = 100)
    private int numberOfWorkers;

    public WareHouse() {
    }

    public WareHouse(String sity, String adress, int phoneNumberOfWarehouse, String director, int numberOfWorkers) {
        this.sity = sity;
        this.adress = adress;
        this.phoneNumberOfWarehouse = phoneNumberOfWarehouse;
        this.director = director;
        this.numberOfWorkers = numberOfWorkers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumberOfWarehouse() {
        return phoneNumberOfWarehouse;
    }

    public void setPhoneNumberOfWarehouse(int phoneNumberOfWarehouse) {
        this.phoneNumberOfWarehouse = phoneNumberOfWarehouse;
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
        return "WareHouse{" +
                "id=" + id +
                ", sity='" + sity + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumberOfWarehouse=" + phoneNumberOfWarehouse +
                ", director='" + director + '\'' +
                ", numberOfWorkers=" + numberOfWorkers +
                '}';
    }
}
