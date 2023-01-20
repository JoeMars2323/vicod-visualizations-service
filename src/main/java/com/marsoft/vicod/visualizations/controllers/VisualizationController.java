package com.marsoft.vicod.visualizations.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marsoft.vicod.visualizations.exceptions.VicodException;
import com.marsoft.vicod.visualizations.rest.VicodRestResponse;
import com.marsoft.vicod.visualizations.rest.VisualizationRest;
import com.marsoft.vicod.visualizations.services.VisualizationService;
import com.marsoft.vicod.visualizations.utils.CommonConstants;
import com.marsoft.vicod.visualizations.utils.RestConstants;


@RestController
@RequestMapping(RestConstants.APPLICATION_NAME + RestConstants.API_VERSION_1 + RestConstants.VISUALIZATIONS)
public class VisualizationController {
	
	@Autowired
	private VisualizationService visualizationService;
	
	
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public VicodRestResponse<List<VisualizationRest>> getVisualizations() throws VicodException {
		return new VicodRestResponse<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.OK), CommonConstants.OK,
				visualizationService.getVisualizations());
	}

	
	
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public VicodRestResponse<VisualizationRest> createVisualization(
			@RequestBody VisualizationRest visualizationRest)
			throws VicodException {
		return new VicodRestResponse<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.OK), CommonConstants.OK,
				visualizationService.createCategories(visualizationRest));
	}

}