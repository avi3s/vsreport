package com.vs.vsreport.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vs.vsreport.entity.RoutingEntity;

public interface RoutingDAO extends CrudRepository<RoutingEntity, Long> {

	List<RoutingEntity> findAllByLastUpdatedGTSLessThanEqualAndLastUpdatedGTSGreaterThanEqual(Date endDate, Date startDate);
}
