package ru.springboot.dao.Employees;

import ru.springboot.model.Employees;

import java.util.List;

public interface EmployeesDao {
    /**
     * Получить все объекты Employees
     *
     * @return
     */
    List<Employees> all();

    /**
     * Получить Employees по идентификатору
     *
     * @param employeeId
     * @return
     */
    Employees loadById(Long employeeId);

    /**
     * Сохранить Employees
     *
     * @param Employees
     */
    void save(Employees employees);
}
