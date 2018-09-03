package com.shopandwarehousesolution.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false, length = 30)
    private String surname;

    @Column(nullable = false, length = 90)
    private short age;


    @Column(nullable = false, length = 2)
    private String passportSerie;
    @Column(nullable = true)
    private int ShopId;
    @Column(nullable = true)
    private int WareHouseId;


    @Column(nullable = false)
    private int passportNumber;

    @Size(min = 4, max = 30,
            message = "username must be more than 4 symbols and less than 30")
    @Column(nullable = false, length = 30, unique = true)
    private String username;

    @Size(min = 4)
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Authority authority = Authority.ROLE_USER;

    private String avatar;

    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true;

    public User() {
    }

    public User(String email, String name, String surname, short age, String passportSerie, int shopId, int wareHouseId, int passportNumber, String username, String password, Authority authority, String avatar, boolean accountNonExpired, boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.passportSerie = passportSerie;
        this.ShopId = shopId;
        this.WareHouseId = wareHouseId;
        this.passportNumber = passportNumber;
        this.username = username;
        this.password = password;
        this.authority = authority;
        this.avatar = avatar;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
    }

    public User(String email, String name, String surname, short age, String passportSerie, int passportNumber, String username, String password, String avatar) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.passportSerie = passportSerie;
        this.passportNumber = passportNumber;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getPassportSerie() {
        return passportSerie;
    }

    public void setPassportSerie(String passportSerie) {
        this.passportSerie = passportSerie;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(authority.name()));
        return authorities;
    }

    public int getShopId() {
        return ShopId;
    }

    public void setShopId(int shopId) {
        ShopId = shopId;
    }

    public int getWareHouseId() {
        return WareHouseId;
    }

    public void setWareHouseId(int wareHouseId) {
        WareHouseId = wareHouseId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String photo) {
        this.avatar = photo;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", passportSerie='" + passportSerie + '\'' +
                ", ShopId=" + ShopId +
                ", WareHouseId=" + WareHouseId +
                ", passportNumber=" + passportNumber +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                ", avatar='" + avatar + '\'' +
                ", accountNonExpired=" + accountNonExpired +
                ", accountNonLocked=" + accountNonLocked +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", enabled=" + enabled +
                '}';
    }
}
