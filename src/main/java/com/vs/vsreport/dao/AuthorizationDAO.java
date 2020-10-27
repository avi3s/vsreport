package com.vs.vsreport.dao;

import org.springframework.data.repository.CrudRepository;

import com.vs.vsreport.entity.AuthorizationEntity;

public interface AuthorizationDAO extends CrudRepository<AuthorizationEntity, Long> {

}
