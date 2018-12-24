package ru.springboot.model;


import javax.persistence.*;
import java.util.Set;

/**
 * PHANTOMHUNTER
 *  Страна
 **/

@Entity
@Table(name = "COUNTRIES")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*ID Страны*/
    @Column(name = "COUNTRIES_ID",nullable = false)
    private Long countriesId;
    /* Страна */
    @Column(name = "COUNTRIES_NAME",nullable = false)
    private String countriesName;

    /* Код Страны */
    @Column(name = "COUNTRIES_CODE",nullable = false)
    private String countriesCode;

    /*Гетеры и Сетеры*/

    public Long getCountriesId() {
        return countriesId;
    }
    public String getCountriesName() {
        return countriesName;
    }
    public void setCountriesName(String countriesName) {
        this.countriesName = countriesName;
    }
    public String getCountriesCode() {
        return countriesCode;
    }
    public void setCountriesCode(String countriesCode) {
        this.countriesCode = countriesCode;
    }

    /*Конструкторы*/
    public Countries (){
    }

    public Countries  (String countriesName,
                       String countriesCode){
        this.countriesName = countriesName;
        this.countriesCode = countriesCode;
    }
    /*-------------------BEGIN. Страна - Сотрудники---------------------------*/
    private Set<Employees> employees;
    @org.jetbrains.annotations.Contract(pure = true)
    @OneToMany(
            mappedBy="countries",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Employees> getEmployees(){
        return employees;
    }
    public void addEmployees(Employees employees) {
        getEmployees().add(employees);
        employees.setCountries(this);
    }
    public void removeEmployees(Employees employees) {
        getEmployees().remove(employees);
        employees.setCountries(null);
    }
    /*-------------------- END. Страна - Сотрудники---------------------------*/



}
