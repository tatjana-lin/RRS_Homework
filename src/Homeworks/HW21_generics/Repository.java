package Homeworks.HW21_generics;

import java.util.List;

public interface Repository <T extends EntityWithId<IdType>, IdType>{

    T findById(IdType id);
    void save(T e);
    List<T> findAll();
}
