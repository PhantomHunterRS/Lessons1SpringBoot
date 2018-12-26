package ru.springboot.service;

import org.springframework.validation.annotation.Validated;
import ru.springboot.view.EmployeesView;

import javax.validation.Valid;
import java.util.List;

/*Service*/
@Validated
public interface EmployeesService {
    /**Добавить нового сотрудника @param employees */
    void add(@Valid EmployeesView employees);

    /**Получить список сотрудников @return {@Employees}*/
    List<EmployeesView> employees();

    /**Сохранить измененные данные сотрудника @param employees */
    void update(@Valid EmployeesView employees);

}

