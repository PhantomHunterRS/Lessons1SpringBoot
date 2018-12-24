package ru.springboot.dao.Docs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.springboot.model.Docs;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class DocsDaoImpl implements DocsDao {

    private final EntityManager em;

    @Autowired
    public DocsDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Docs> all() {
        TypedQuery<Docs> query = em.createQuery("SELECT h FROM Docs h", Docs.class);
        return query.getResultList();
    }
    @Override
    public Docs loadById(Long docsId) {
        return em.find(Docs.class, docsId);
    }

    @Override
    public void save(Docs docs) {
        em.persist(docs);
    }

}
