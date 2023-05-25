package com.inventory.service;

import java.util.List;

import com.inventory.entity.Segment;

public interface SegmentService {
	
	public List<Segment> findAllSegment();
	
	public Segment findSegmentById(Long segmentId);
	
	public void createSegment(Segment segment);
	
	public void updateSegment(Segment segment);
	
	public void deleteSegment(Segment segmentId);

	void deleteSegment(Long segmentId);
	
	

}
