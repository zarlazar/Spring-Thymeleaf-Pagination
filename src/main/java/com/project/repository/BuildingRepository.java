package com.project.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.project.domain.Building;

@Repository
public interface BuildingRepository extends PagingAndSortingRepository<Building, Long> {

}
