package ru.springboot.dao.Countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.springboot.model.Countries;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CounteriesDaoImpl implements CountriesDao {

    private final EntityManager em;
    @Autowired
    public CounteriesDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Countries> all() {
        TypedQuery<Countries> query = em.createQuery("SELECT h FROM COUNTRIES h", Countries.class);
        return query.getResultList();
    }

    @Override
    public Countries loadById(Long id) {
        return em.find(Countries.class, id);
    }

    @Override
    public void save(Countries countries) {
        em.persist(countries);
    }

}
