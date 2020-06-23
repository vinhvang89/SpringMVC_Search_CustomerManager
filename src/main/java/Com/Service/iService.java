package Com.Service;

import java.util.List;

public interface iService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);
}
