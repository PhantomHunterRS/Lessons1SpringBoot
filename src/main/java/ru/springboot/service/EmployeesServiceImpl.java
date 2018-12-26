package ru.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springboot.dao.Employees.EmployeesDao;
import ru.springboot.model.Employees;
import ru.springboot.model.mapper.MapperFacade;
import ru.springboot.view.EmployeesView;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService{

    private final EmployeesDao dao;
    private final MapperFacade mapperFacade;

    @Autowired
    public EmployeesServiceImpl(EmployeesDao dao, MapperFacade mapperFacade) {
        this.dao = dao;
        this.mapperFacade = mapperFacade;
    }
    @Override
    @Transactional
    public void add(EmployeesView view) {
        Employees employees = new Employees(view.employeeFirstName, view.employeeLastName,view.employeePosition,view.employeePhone);
        dao.add(employees);
    }
    @Override
    @Transactional
    public void update(EmployeesView view) {
        Employees employees = new Employees(view.employeeFirstName, view.employeeLastName,view.employeePosition,view.employeePhone);
        dao.update(employees);
    }
    @Override
    @Transactional(readOnly = true)
    public List<EmployeesView> employees() {
        List<Employees> all = dao.all();
        return mapperFacade.mapAsList(all, EmployeesView.class);
    }

}
