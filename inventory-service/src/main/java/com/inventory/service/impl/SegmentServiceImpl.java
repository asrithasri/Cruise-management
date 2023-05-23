package com.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Segment;
import com.inventory.repositoty.SegmentRepository;
import com.inventory.service.SegmentService;

@Service
public class SegmentServiceImpl implements SegmentService{
	
	@Autowired
	private SegmentRepository segmentRepository;
	
	
	public SegmentServiceImpl(SegmentRepository segmentRepository) {
		super();
		this.segmentRepository = segmentRepository;
	}

	@Override
	public List<Segment> findAllSegment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Segment findSegmentById(Long segmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createSegment(Segment segment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSegment(Segment segment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSegment(Segment segmentId) {
		// TODO Auto-generated method stub
		
	}

}
