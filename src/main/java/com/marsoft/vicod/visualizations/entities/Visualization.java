package com.marsoft.vicod.visualizations.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "visualizations")
public class Visualization implements Serializable {
	
	private static final long serialVersionUID = -6789747608956830105L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="visualizations_id")
	private Long visualizationId;

	@Column(name = "alias")
	private String alias;
	
	@Column(name = "visualization_content")
	private String visualizationContent;
	
	@Column(name = "isFinished")
	private boolean isFinished;
	
	@Column(name = "starting_position")
	private int startingPosition;
	
	
	
	public Long getVisualizationId() {
		return visualizationId;
	}

	public void setVisualizationId(Long visualizationId) {
		this.visualizationId = visualizationId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getVisualizationContent() {
		return visualizationContent;
	}

	public void setVisualizationContent(String visualizationContent) {
		this.visualizationContent = visualizationContent;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public int getStartingPosition() {
		return startingPosition;
	}

	public void setStartingPosition(int startingPosition) {
		this.startingPosition = startingPosition;
	}
	
	

}