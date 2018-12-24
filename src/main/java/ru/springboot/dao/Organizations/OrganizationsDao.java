package ru.springboot.dao.Organizations;


import ru.springboot.model.Organizations;

import java.util.List;

public interface OrganizationsDao {
    /**
     * Получить все объекты Organizations
     *
     * @return
     */
    List<Organizations> all();

    /**
     * Получить Organizations по идентификатору
     *
     * @param organizationId
     * @return
     */
    Organizations loadById(Long organizationId);

    /**
     * Получить Organizations по имени
     *
     * @param organizationName
     * @return
     */
    Organizations loadByName(String organizationName);



    /**
     * Сохранить Organizations
     *
     * @param organizations
     */
    void save(Organizations organizations);
}
