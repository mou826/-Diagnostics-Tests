package com.diaStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diaStore.entity.Diagonstic;


@Repository
public interface DiaRepository extends JpaRepository<Diagonstic, Integer>{

}
