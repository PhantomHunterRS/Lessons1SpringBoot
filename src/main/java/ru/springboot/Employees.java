package ru.springboot;

import javax.persistence.*;
import java.util.Date;

/**
 * PHANTOMHUNTER
 * Сотрудники
 **/

@Entity
@Table(name = "EMPLOYEES")
public class Employees {

    @Id
    @GeneratedValue

    @Column(name = "EMPLOYEE_ID",nullable = false)
    public Integer employeeId;
        /* Имя Сотрудника*/
    @Column(name= "EMPLOYEE_FIRST_NAME",length = 255, nullable = false)
    public String employeeFirstName;
        /* Отчество Сотрудника*/
    @Column(name= "EMPLOYEE_SECOND_NAME",length = 255, nullable = false)
    public String employeeSecondName;
        /* Фамилия Сотрудника*/
    @Column(name= "EMPLOYEE_LAST_NAME",length = 255, nullable = false)
    public String employeeLastName;
        /* Номер офиса Сотрудника*/
    @Column(name= "EMPLOYEE_OFFIICE_ID",nullable = false)
    public Integer employeeOfficeId;
        /*Должность Сотрудника*/
    @Column(name= "EMPLOYEE_POSITION",length = 255, nullable = false)
    public String employeePosition;
        /*Телефонный номер Сотрудника*/
    @Column(name= "EMPLOYEE_PHONE",length = 20,nullable = false)
    public String employeePhone;
        /*Гражданство Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_CODE",nullable = false)
    public Integer employeeDocCode;
        /*Удостоверение Личности Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_NAME",length = 255,nullable = false)
    public String employeeDocName;
        /*Номер Удостоверение Личности Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_NUMBER",length = 16,nullable = false)
    public String employeeDocNumber;
        /*Дата Выдачи УдостЛичности Сотрудника*/
    @Column(name= "EMPLOYEE_DOC_DATA",nullable = false)
    public Date employeeDocData;
        /*ГражданствоСотрудника*/
    @Column(name= "EMPLOYEE_CITIZENSHIP_NAME",length = 255,nullable = false)
    public String employeeCitizenshipName;
        /*Код Гражданство Сотрудника*/
    @Column(name= "EMPLOYEE_CITIZENSHIP_CODE",nullable = false)
    public Integer employeeCitizenshipCode;
        /*Работает/Уволен Сотрудника*/
    @Column(name= "EMPLOYEE_IS_IDENTIFIED",nullable = false)
    public Boolean employeeIsIdentified;










}
