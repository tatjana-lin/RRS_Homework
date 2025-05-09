package Homeworks.HW21_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRepository<T extends EntityWithId<IdType>, IdType> implements Repository<T, IdType> {

    Map<IdType, T> repositoryData = new HashMap<>();

    @Override
    public T findById(IdType id) {
        return repositoryData.get(id);
    }

    @Override
    public void save(T e) {
        repositoryData.put(e.getId(), e);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(repositoryData.values());
    }
}
