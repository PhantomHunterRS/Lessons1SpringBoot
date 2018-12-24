package ru.springboot.dao.Docs;


import ru.springboot.model.Docs;

import java.util.List;

public interface DocsDao {
    /**
     * Получить все объекты Docs
     *
     * @return
     */
    List<Docs> all();

    /**
     * Получить Docs по идентификатору
     *
     * @param docsId
     * @return
     */
    Docs loadById(Long docsId);

    /**
     * Сохранить Docs
     *
     * @param Docs
     */
    void save(Docs docs);
}
