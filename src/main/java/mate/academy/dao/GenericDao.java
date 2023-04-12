package mate.academy.dao;

import java.util.Optional;

public interface GenericDao<T> {
    T add(T element);

    Optional<T> get(Long id);
}
