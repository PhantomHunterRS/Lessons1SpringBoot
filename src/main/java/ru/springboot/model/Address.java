package ru.springboot.model;

import javax.persistence.*;

/**
 * PHANTOMHUNTER
 **/

@Embeddable
@Table(name = "ADDRESS")
public class Address {

    @Column(name = "ADDRESS_ID",nullable = false)
    private Long addressId;
    /* Номер Почтового отделения*/
    @Column(name = "ADDRESS_ZIPCODE",nullable = false)
    private Integer addressZipCode;
    /* Город*/
    @Column(name = "ADDRESS_CITY",nullable = false)
    private String addressCity;
    /* Улица*/
    @Column(name = "ADDRESS_STREET",nullable = false)
    private String addressStreet;
    /* Номер Дома */
    @Column(name = "ADDRESS_HOUSE",length = 6,nullable = false)
    private String addressHouse;
    /* Номер Корпуса */
    @Column(name = "ADDRESS_HOUSING",length = 4,nullable = false)
    private String addressHousing;
    /* Номер Квартиры */
    @Column(name = "ADDRESS_APARTAMENT",length = 4,nullable = false)
    private String addressApartament;

    public Long getAddressId() {
        return addressId;
    }
    public Integer getAddressZipCode() {
        return addressZipCode;
    }
    public void setAddressZipCode(Integer addressZipCode) {
        this.addressZipCode = addressZipCode;
    }
    public String getAddressCity() {
        return addressCity;
    }
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }
    public String getAddressStreet() {
        return addressStreet;
    }
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }
    public String getAddressHouse() {
        return addressHouse;
    }
    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }
    public String getAddressHousing() {
        return addressHousing;
    }
    public void setAddressHousing(String addressHousing) {
        this.addressHousing = addressHousing;
    }
    public String getAddressApartament() {
        return addressApartament;
    }
    public void setAddressApartament(String addressApartament) {
        this.addressApartament = addressApartament;
    }

    public Address() {
    }

    public Address(Long addressId,
                   Integer addressZipCode,
                   String addressCity,
                   String addressStreet,
                   String addressHouse,
                   String addressHousing,
                   String addressApartament) {
        this.addressId = addressId;
        this.addressZipCode = addressZipCode;
        this.addressCity = addressCity;
        this.addressStreet = addressStreet;
        this.addressHouse = addressHouse;
        this.addressHousing = addressHousing;
        this.addressApartament = addressApartament;
    }
}
