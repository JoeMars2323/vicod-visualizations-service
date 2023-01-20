package com.marsoft.vicod.visualizations.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marsoft.vicod.visualizations.entities.Visualization;
import com.marsoft.vicod.visualizations.exceptions.InternalServerErrorException;
import com.marsoft.vicod.visualizations.exceptions.VicodException;
import com.marsoft.vicod.visualizations.repositories.VisualizationRepository;
import com.marsoft.vicod.visualizations.rest.VisualizationRest;
import com.marsoft.vicod.visualizations.utils.ExceptionConstants;


@Service
public class VisualizationServiceImpl implements VisualizationService {
	
	private Logger log = LoggerFactory.getLogger(VisualizationServiceImpl.class);
	
	@Autowired
	private VisualizationRepository visualizationRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	
	
	@Override
	public List<VisualizationRest> getVisualizations() throws VicodException {
		log.info("get visualization - begin");
		List<VisualizationRest> visualizationRestList = visualizationRepository.findAll().stream()
				.map(visualization -> modelMapper.map(visualization, VisualizationRest.class))
				.collect(Collectors.toList());
		log.info("get visualization - end");
		return visualizationRestList;
	}
	
	
	
	@Override
	public VisualizationRest createCategories(final VisualizationRest visualizationRest) throws VicodException {
		Visualization visualization = new Visualization();
		visualization.setAlias(visualizationRest.getAlias());
		visualization.setFinished(visualizationRest.isFinished());
		visualization.setStartingPosition(visualizationRest.getStartingPosition());
		visualization.setVisualizationContent(visualizationRest.getVisualizationContent());
		try {
			visualization = visualizationRepository.save(visualization);
		} catch (final Exception e) {
			log.error(ExceptionConstants.INTERNAL_SERVER_ERROR, e);
			throw new InternalServerErrorException(ExceptionConstants.INTERNAL_SERVER_ERROR);
		}
		return modelMapper.map(visualization, VisualizationRest.class);
	}

	
	
}