package ru.springboot.dao.Offices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.springboot.model.Office;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class OfficeDaoImpl implements OfficeDao {
        private final EntityManager em;

        @Autowired
        public OfficeDaoImpl(EntityManager em) {
            this.em = em;
        }

        @Override
        public List<Office> all() {
            TypedQuery<Office> query = em.createQuery("SELECT h FROM Office h", Office.class);
            return query.getResultList();
        }
        @Override
        public Office loadById(Long officeId) {
            return em.find(Office.class, officeId);
        }
        @Override
        public void save(Office office) {
            em.persist(office);
        }
}
