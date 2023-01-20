package com.marsoft.vicod.visualizations.services;

import java.util.List;

import com.marsoft.vicod.visualizations.exceptions.VicodException;
import com.marsoft.vicod.visualizations.rest.VisualizationRest;


public interface VisualizationService {
	
public List<VisualizationRest> getVisualizations() throws VicodException;
	
	public VisualizationRest createCategories(final VisualizationRest visualizationRest) throws VicodException;

}
