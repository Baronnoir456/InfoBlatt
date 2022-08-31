package com.lars.infoblatt;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface InfoBlattRepo extends CrudRepository<InfoBlatt,Long> {
    @Override
    <S extends InfoBlatt> S save(S entity);

    @Override
    <S extends InfoBlatt> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    Optional<InfoBlatt> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    List<InfoBlatt> findAll();

    @Override
    Iterable<InfoBlatt> findAllById(Iterable<Long> longs);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(InfoBlatt entity);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    void deleteAll(Iterable<? extends InfoBlatt> entities);

    @Override
    void deleteAll();
}
