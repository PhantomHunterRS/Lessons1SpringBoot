package ru.springboot.dao.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.springboot.model.Employees;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EmployeesDaoImpl implements EmployeesDao{

        private final EntityManager em;

        @Autowired
        public EmployeesDaoImpl(EntityManager em) {
            this.em = em;
        }

        @Override
        public List<Employees> all() {
            TypedQuery<Employees> query = em.createQuery("SELECT h FROM Employees h", Employees.class);
            return query.getResultList();
        }
        @Override
        public Employees loadById(Long employeeId) {
            return em.find(Employees.class, employeeId);
        }

        @Override
        public void save(Employees employees) {
            em.persist(employees);
        }

}
