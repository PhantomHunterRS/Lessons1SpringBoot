package ru.springboot.dao.Organizations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.springboot.model.Organizations;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@Repository
public class OrganizationsDaoImpl {
    private final EntityManager em;

    @Autowired
    public OrganizationsDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Organizations> all() {
        TypedQuery<Organizations> query = em.createQuery("SELECT p FROM Organizations p", Organizations.class);
        return query.getResultList();
    }

    @Override
    public Organizations loadById(Long organizationId) {
        return em.find(Organizations.class, organizationId);
    }

    @Override
    public Organizations loadByName(String organizationName) {
        CriteriaQuery<Organizations> criteria = buildCriteria(organizationName);
        TypedQuery<Organizations> query = em.createQuery(criteria);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Organizations organizations) {
        em.persist(organizations);
    }

    private CriteriaQuery<Organizations> buildCriteria(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Organizations> criteria = builder.createQuery(Organizations.class);

        Root<Organizations> person = criteria.from(Organizations.class);
        criteria.where(builder.equal(person.get("name"), name));

        return criteria;
    }

}
