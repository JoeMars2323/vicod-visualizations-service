package com.marsoft.vicod.visualizations.rest;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisualizationRest implements Serializable {
	
	private static final long serialVersionUID = -75255269674063227L;
	
	private Long visualizationId;
	private String alias;
	private String visualizationContent;
	private boolean isFinished;
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