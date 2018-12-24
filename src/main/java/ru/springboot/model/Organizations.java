package ru.springboot.model;


import javax.persistence.*;
import java.util.Set;

/**
 * PHANTOMHUNTER
 *  Организация
 **/

@Entity
@Table(name = "ORGANIZATIONS")
public class Organizations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ORGANIZATION_ID",nullable = false)
    private Long organizationId;
    /* Сокращенное Название Органиации */
    @Column(name = "ORGANIZATION_NAME",nullable = false)
    private String organizationName;
    /* ПолноеНазвание Органиации */
    @Column(name = "ORGANIZATION_FULL_NAME",nullable = false)
    private String organizationFullName;
    /* ИНН Органиации */
    @Column(name = "ORGANIZATION_INN",length = 10,nullable = false)
    private Integer organizationInn;
    /* КПП Органиации */
    @Column(name = "ORGANIZATION_KPP",length = 10,nullable = false)
    private Integer organizationKpp;
    /* Адрес Органиации */
    @Column(name = "ORGANIZATION_ADDRESS",nullable = false)
    private Address address;
    /* Телефон Органиации */
    @Column(name = "ORGANIZATION_PHONE",length = 20,nullable = false)
    private String organizationPhone;
    /* КПП Органиации */
    @Column(name = "ORGANIZATION_IsAlive",nullable = false)
    private Boolean organizationIsAlive;

    /*Гетеры и Сетеры*/

    public Long getOrganizationId() {
        return organizationId;
    }
    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    public String getOrganizationFullName() {
        return organizationFullName;
    }
    public void setOrganizationFullName(String organizationFullName) {
        this.organizationFullName = organizationFullName;
    }
    public Integer getOrganizationInn() {
        return organizationInn;
    }
    public void setOrganizationInn(Integer organizationInn) {
        this.organizationInn = organizationInn;
    }
    public Integer getOrganizationKpp() {
        return organizationKpp;
    }
    public void setOrganizationKpp(Integer organizationKpp) {
        this.organizationKpp = organizationKpp;
    }
    public Address getOrganizationAddress() {
        return address;
    }
    public void setOrganizationAddress(Address address) {
        this.address = address;
    }
    public String getOrganizationPhone() {
        return organizationPhone;
    }
    public void setOrganizationPhone(String organizationPhone) {
        this.organizationPhone = organizationPhone;
    }
    public Boolean getOrganizationIsAlive() {
        return organizationIsAlive;
    }
    public void setOrganizationIsAlive(Boolean organizationIsAlive) {
        this.organizationIsAlive = organizationIsAlive;
    }

    /*Конструкторы*/
    public Organizations (){
    }

    public Organizations  (Long organizationId,
                           String organizationName,
                           String organizationFullName,
                           Integer organizationInn,
                           Integer organizationKpp,
                           Address address,
                           String organizationPhone,
                           Boolean organizationIsAlive){
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.organizationFullName = organizationFullName;
        this.organizationInn = organizationInn;
        this.organizationKpp = organizationKpp;
        this.address = address;
        this.organizationPhone = organizationPhone;
        this.organizationIsAlive = organizationIsAlive;
    }
    /*-------------------BEGIN.Организация - Сотрудники----------------------*/
    private Set<Employees> employees;
    @org.jetbrains.annotations.Contract(pure = true)
    @OneToMany(
            mappedBy="organizations",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Employees> getEmployees(){
        return employees;
    }
    public void addEmployees(Employees employees) {
        getEmployees().add(employees);
        employees.setOrganizations(this);
    }
    public void removeEmployees(Employees employees) {
        getEmployees().remove(employees);
        employees.setOrganizations(null);
    }
    /*-------------------- END.Организация - Сотрудники----------------------*/
    /*-------------------BEGIN. Организация - Адресс-------------------------*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressId")
        public Address getAddress() {
            return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    /*-------------------- END. Организация - Адресс-------------------------*/

}
