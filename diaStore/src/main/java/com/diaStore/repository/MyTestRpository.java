package com.diaStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diaStore.entity.MyTestList;

@Repository
public interface MyTestRpository extends JpaRepository<MyTestList, Integer> {

}
