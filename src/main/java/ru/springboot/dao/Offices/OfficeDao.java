package ru.springboot.dao.Offices;

import ru.springboot.model.Office;
import java.util.List;

public interface OfficeDao {
    /**
     * Получить все объекты Office
     *
     * @return
     */
    List<Office> all();

    /**
     * Получить Office по идентификатору
     *
     * @param officeId
     * @return
     */
    Office loadById(Long officeId);

    /**
     * Сохранить Office
     *
     * @param Office
     */
    void save(Office office);
}
