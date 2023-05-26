package com.inventory.service;

import java.util.List;

import com.inventory.entity.Segment;

public interface SegmentService {
	
	public List<Segment> findAllSegment();
	
	public Segment findSegmentById(Long segmentId);
	
	public Segment createSegment(Segment segment);
	
	public Segment updateSegment(Segment segment);
	
	public void deleteSegment(Segment segmentId);

	void deleteSegment(Long segmentId);
	
	

}
