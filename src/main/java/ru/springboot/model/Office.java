package ru.springboot.model;


import javax.persistence.*;
import java.util.Set;

/**
 * PHANTOMHUNTER
 * Офис
 **/

@Entity
@Table(name = "OFFICE")
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "OFFICE_ID",nullable = false)
    private Long officeId;
    /*Название Офиса*/
    @Column(name = "OFFICE_NAME",nullable = false)
    private String officeName;
    /*Адрес Офиса*/
    @Column(name = "OFFICE_ADDRESS",nullable = false)
    private Address address;
    /*Телефон Офиса*/
    @Column(name = "OFFICE_PHONE",length = 20,nullable = false)
    private String officePhone;
    /*Существует или нет Офис*/
    @Column(name = "OFFICE_IsAlive",nullable = false)
    private boolean officeIsAlive;

    /*Гетеры и Сетеры*/

    public Long getOfficeId() {
        return officeId;
    }
    public String getOfficeName() {
        return officeName;
    }
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
    public Address getOfficeAddress() {
        return address;
    }
    public void setOfficeAddress(Address address) {
        this.address = address;
    }
    public String getOfficePhone() {
        return officePhone;
    }
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }
    public boolean isOfficeIsAlive() {
        return officeIsAlive;
    }
    public void setOfficeIsAlive(boolean officeIsAlive) {
        this.officeIsAlive = officeIsAlive;
    }


    @ManyToMany(
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "CONNECTION_OFFICES_ADDRESS",
            joinColumns = @JoinColumn(name = "CONNECTION_OFFICES_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONNECTION_ADDRESS_ID")
    )
    private Set<Address> addresses;

    /*Конструкторы*/
    public Office (){
    }

    public Office(Long officeId,
                  String officeName,
                  Address address,
                  String officePhone,
                  Boolean officeIsAlive){
        this.officeId = officeId;
        this.officeName = officeName;
        this.address = address;
        this.officePhone = officePhone;
        this.officeIsAlive = officeIsAlive;
    }
    /*-------------------BEGIN. Офис - Сотрудники-----------------------------*/
    private Set<Employees> employees;

    @OneToMany(
            mappedBy="office",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Employees> getEmployees(){
        return employees;
    }
    public void addEmployees(Employees employees) {
        getEmployees().add(employees);
        employees.setOffice(this);
    }
    public void removeEmployees(Employees employees) {
        getEmployees().remove(employees);
        employees.setOffice(null);
    }
    /*---------------------END. Офис - Сотрудники-----------------------------*/
    /*-------------------BEGIN. Офис - Адресс --------------------------------*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressId")
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    /*---------------------END. Офис - Адресс --------------------------------*/
}

