package ru.springboot.dao.Countries;

import ru.springboot.model.Countries;

import java.util.List;

public interface CountriesDao {
    /**
     * Получить все объекты Countries
     *
     * @return
     */
    List<Countries> all();

    /**
     * Получить Countries по идентификатору
     *
     * @param id
     * @return
     */
    Countries loadById(Long id);

    /**
     * Сохранить Countries
     *
     * @param countries
     */
    void save(Countries countries);
}
