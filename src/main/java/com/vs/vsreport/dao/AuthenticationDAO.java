package com.vs.vsreport.dao;

import org.springframework.data.repository.CrudRepository;

import com.vs.vsreport.entity.AuthenticationEntity;

public interface AuthenticationDAO extends CrudRepository<AuthenticationEntity, Long> {

}
