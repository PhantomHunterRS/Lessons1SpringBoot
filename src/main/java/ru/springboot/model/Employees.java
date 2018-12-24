package ru.springboot.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PHANTOMHUNTER
 * Сотрудники
 **/

@Entity
@Table(name = "EMPLOYEES")
public class Employees {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name = "EMPLOYEE_ID",nullable = false)
    private Long employeeId;
        /* Имя Сотрудника*/
    @Column(name= "EMPLOYEE_FIRST_NAME", nullable = false)
    public String employeeFirstName;
        /* Отчество Сотрудника*/
    @Column(name= "EMPLOYEE_SECOND_NAME")
    public String employeeSecondName;
        /* Фамилия Сотрудника*/
    @Column(name= "EMPLOYEE_LAST_NAME", nullable = false)
    public String employeeLastName;
        /* Номер Офиса Сотрудника*/
    @Column(name= "EMPLOYEE_OFFIICE_ID",nullable = false)
    public int employeeOfficeId;
    /* Номер Организации Сотрудника*/
    @Column(name= "EMPLOYEE_ORGANIZATION_ID",nullable = false)
    public int employeeOrganizationId;
        /*Должность Сотрудника*/
    @Column(name= "EMPLOYEE_POSITION", nullable = false)
    public String employeePosition;
        /*Телефонный номер Сотрудника*/
    @Column(name= "EMPLOYEE_PHONE",length = 20,nullable = false)
    public String employeePhone;
        /*Гражданство Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_CODE")
    public int employeeDocCode;
        /*Удостоверение Личности Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_NAME")
    public String employeeDocName;
        /*Номер Удостоверение Личности Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_NUMBER",length = 16)
    public String employeeDocNumber;
        /*Дата Выдачи УдостЛичности Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_DATA",nullable = false)
    public Date employeeDocData;
        /*ГражданствоСотрудника*/
    @Column(name= "EMPLOYEE_CITIZENSHIP_NAME",nullable = false)
    public String employeeCitizenshipName;
        /*Код Гражданство Сотрудника*/
    @Column(name= "EMPLOYEE_CITIZENSHIP_CODE",nullable = false)
    public int employeeCitizenshipCode;
        /*Работает/Уволен Сотрудника*/
    @Column(name= "EMPLOYEE_IS_IDENTIFIED",nullable = false)
    public Boolean employeeIsIdentified;

    /*Гетеры и Сетеры*/
    public Long getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }
    public String getEmployeeSecondName() {
        return employeeSecondName;
    }
    public void setEmployeeSecondName(String employeeSecondName) {
        this.employeeSecondName = employeeSecondName;
    }
    public String getEmployeeLastName() {
        return employeeLastName;
    }
    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
    public int getEmployeeOfficeId() {
        return employeeOfficeId;
    }
    public void setEmployeeOfficeId(Integer employeeOfficeId) {
        this.employeeOfficeId = employeeOfficeId;
    }
    public int getEmployeeOrganizationId() {
        return employeeOrganizationId;
    }
    public void setEmployeeOrganizationId(Integer employeeOrganizationId) {
        this.employeeOrganizationId = employeeOrganizationId;
    }
    public String getEmployeePosition() {
        return employeePosition;
    }
    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }
    public String getEmployeePhone() {
        return employeePhone;
    }
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }
    public int getEmployeeDocCode() {
        return employeeDocCode;
    }
    public void setEmployeeDocCode(Integer employeeDocCode) {
        this.employeeDocCode = employeeDocCode;
    }
    public String getEmployeeDocName() {
        return employeeDocName;
    }
    public void setEmployeeDocName(String employeeDocName) {
        this.employeeDocName = employeeDocName;
    }
    public String getEmployeeDocNumber() {
        return employeeDocNumber;
    }
    public void setEmployeeDocNumber(String employeeDocNumber) {
        this.employeeDocNumber = employeeDocNumber;
    }
    public Date getEmployeeDocData() {
        return employeeDocData;
    }
    public void setEmployeeDocData(Date employeeDocData) {
        this.employeeDocData = employeeDocData;
    }
    public String getEmployeeCitizenshipName() {
        return employeeCitizenshipName;
    }
    public void setEmployeeCitizenshipName(String employeeCitizenshipName) {
        this.employeeCitizenshipName = employeeCitizenshipName;
    }
    public int getEmployeeCitizenshipCode() {
        return employeeCitizenshipCode;
    }
    public void setEmployeeCitizenshipCode(Integer employeeCitizenshipCode) {
        this.employeeCitizenshipCode = employeeCitizenshipCode;
    }
    public Boolean getEmployeeIsIdentified() {
        return employeeIsIdentified;
    }
    public void setEmployeeIsIdentified(Boolean employeeIsIdentified) {
        this.employeeIsIdentified = employeeIsIdentified;
    }

    /*Конструкторы*/
    public Employees(){

    }

    public Employees(Long employeeId,
                     String employeeFirstName,
                     String employeeSecondName,
                     String employeeLastName,
                     int employeeOfficeId,
                     int employeeOrganizationId,
                     String employeePosition,
                     String employeePhone,
                     int employeeDocCode,
                     String employeeDocName,
                     String employeeDocNumber,
                     Date employeeDocData,
                     String employeeCitizenshipName,
                     int employeeCitizenshipCode,
                     Boolean employeeIsIdentified) {

        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeSecondName = employeeSecondName;
        this.employeeLastName = employeeLastName;
        this.employeeOfficeId = employeeOfficeId;
        this.employeeOrganizationId = employeeOrganizationId;
        this.employeePosition = employeePosition;
        this.employeePhone = employeePhone;
        this.employeeDocCode = employeeDocCode;
        this.employeeDocName = employeeDocName;
        this.employeeDocNumber = employeeDocNumber;
        this.employeeDocData = employeeDocData;
        this.employeeCitizenshipName = employeeCitizenshipName;
        this.employeeCitizenshipCode = employeeCitizenshipCode;
        this.employeeIsIdentified = employeeIsIdentified;
    }

    /*BEGIN. Сотрудники - Документы*/
    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "CONNECTION_EMPLOYEES_DOCS",
            joinColumns = @JoinColumn(name = "CONNECTION_EMPLOYEES_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONNECTION_DOCS_ID")
    )
    private Set<Docs> documents;
    public Set<Docs> getDocs() {
        if (documents == null) {
            documents = new HashSet<>();
        }
        return documents;
    }
    public void addDocs(Docs documents) {
        getDocs().add(documents);
        documents.getEmployees().add(this);
    }

    public void removeDocs(Docs documents) {
        getDocs().remove(documents);
        documents.getEmployees().remove(this);
    }
    /*-------------------END. Сотрудники - Документы -------------------------*/
    /*-------------------BEGIN. Сотрудники - Офис-----------------------------*/
        private Office office;
    @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "officeId")
    public Office getOffice() {
        return office;
    }
    public void setOffice(Office office) {
        this.office = office;
    }
    /*-------------------- END. Сотрудники - Офис-----------------------------*/
    /*-------------------BEGIN. Сотрудники - Страна---------------------------*/
    private Countries countries;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countriesId")
    public Countries getCountries() {
        return countries;
    }
    public void setCountries(Countries countries) {
        this.countries = countries;
    }
    /*-------------------- END. Сотрудники - Страна---------------------------*/
    /*-------------------BEGIN. Сотрудники - Организация----------------------*/
    private Organizations organizations;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organizationId")
    public Organizations getOrganizations() {
        return organizations;
    }
    public void setOrganizations(Organizations organizations) {
        this.organizations = organizations;
    }
    /*-------------------- END. Сотрудники - Организация----------------------*/
}
