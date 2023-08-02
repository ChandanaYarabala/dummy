package com.dummy.dummy.dao;

import com.dummy.dummy.entity.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends CrudRepository<Login,Integer> {
}
