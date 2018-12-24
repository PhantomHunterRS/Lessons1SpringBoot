package ru.springboot.dao.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.springboot.model.Address;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {

    private final EntityManager em;
    @Autowired
    public AddressDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * PHANTOMHUNTER
     */
    @Override
    public List<Address> all() {
        TypedQuery<Address> query = em.createQuery("SELECT h FROM Address h", Address.class);
        return query.getResultList();
    }

    /**
     * PHANTOMHUNTER
     */
    @Override
    public Address loadById(Long id) {
        return em.find(Address.class, id);
    }

    /**
     * PHANTOMHUNTER
     */
    @Override
    public void save(Address address) {
        em.persist(address);
    }

}
