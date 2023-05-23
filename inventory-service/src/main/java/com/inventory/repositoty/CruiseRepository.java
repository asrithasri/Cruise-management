package com.inventory.repositoty;

import java.util.List;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inventory.entity.Cruise;

public interface CruiseRepository extends JpaRepository<Cruise,Long> {

	@Query
	public List<Cruise>search(String keyword);
}
