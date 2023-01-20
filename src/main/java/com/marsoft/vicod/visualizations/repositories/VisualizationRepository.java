package com.marsoft.vicod.visualizations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marsoft.vicod.visualizations.entities.Visualization;


@Repository
public interface VisualizationRepository extends JpaRepository<Visualization, Long> {

}