package ru.springboot;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * PHANTOMHUNTER
 **/

@Entity
@Table(name = "EMPLOYEES")
public class Employees {

    @EMPLOYEE_ID
    public Integer EMPLOYEE_ID;
    @EMPLOYEE_FIRST_NAME
    public String EMPLOYEE_FIRST_NAME;
    @EMPLOYEE_SECOND_NAME
    public String EMPLOYEE_SECOND_NAME;
    @EMPLOYEE_LAST_NAME
    public String EMPLOYEE_LAST_NAME;
    @EMPLOYEE_LAST_NAME
    public String EMPLOYEE_LAST_NAME;
    @EMPLOYEE_OFFIICE_ID
    public Integer EMPLOYEE_OFFIICE_ID;
    @EMPLOYEE_POSITION
    public String EMPLOYEE_POSITION;
    @EMPLOYEE_PHONE
    public String EMPLOYEE_PHONE;
    @EMPLOYEE_DOC_CODE
    public Integer EMPLOYEE_DOC_CODE;
    @EMPLOYEE_DOC_NAME
    public String EMPLOYEE_DOC_NAME;
    @EMPLOYEE_DOC_NUMBER
    public String EMPLOYEE_DOC_NUMBER;
    @EMPLOYEE_DOC_DATA
    public Date EMPLOYEE_DOC_DATA;
    @EMPLOYEE_CITIZENSHIP_NAME
    public String EMPLOYEE_CITIZENSHIP_NAME;
    @EMPLOYEE_CITIZENSHIP_CODE
    public String EMPLOYEE_CITIZENSHIP_CODE;
    @EMPLOYEE_IS_IDENTIFIED
    public Boolean EMPLOYEE_IS_IDENTIFIED;










}
