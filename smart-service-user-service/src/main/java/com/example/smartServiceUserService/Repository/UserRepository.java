package com.example.smartServiceUserService.Repository;


import com.example.smartServiceUserService.domain.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * @param example
     * @param <S>
     *
     * @return
     */
    @Override
    default <S extends User> List<S> findAll(Example<S> example) {
        return List.of();
    }

    /**
     * @param example
     * @param sort
     * @param <S>
     *
     * @return
     */
    @Override
    default <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    /**
     * @param entities
     * @param <S>
     *
     * @return
     */
    @Override
    default <S extends User> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }


    /**
     * @param aLong
     *
     * @return
     */
    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    /**
     * @return
     */
    @Override
    default List<User> findAll() {
        return List.of();
    }

    /**
     * @param longs
     *
     * @return
     */
    @Override
    default List<User> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    /**
     * @return
     */
    @Override
    default long count() {
        return 0;
    }

    /**
     * @param aLong
     */
    @Override
    default void deleteById(Long aLong) {

    }

    /**
     * @param sort
     *
     * @return
     */
    @Override
    default List<User> findAll(Sort sort) {
        return List.of();
    }
}