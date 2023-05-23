package com.inventory.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Segment;

public interface SegmentRepository extends JpaRepository<Segment,Long>{

}
