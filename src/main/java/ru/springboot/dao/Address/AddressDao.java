package ru.springboot.dao.Address;

import ru.springboot.model.Address;

import java.util.List;

public interface AddressDao {
    /** Получить все объекты Address
     * @return */
    List<Address> all();
    /**
     * Получить Address по идентификатору
     * @param id
     * @return
     */
    Address loadById(Long id);
    /*** Сохранить Address
     *
     * @param address
     */
    void save(Address address);
}
