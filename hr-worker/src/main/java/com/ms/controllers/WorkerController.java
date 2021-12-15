package com.ms.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.entities.Worker;
import com.ms.repositories.WorkerRepository;

@RefreshScope
@RestController
@RequestMapping(value="/workers")
public class WorkerController {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerController.class);
	

	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerRepository repo;
	
	@GetMapping(value="/configs")
	public ResponseEntity<Void> getConfigs(){
	return ResponseEntity.noContent().build();
	}

	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repo.findAll();
		return ResponseEntity.ok(list);
	}
	@GetMapping(value="/{id}")
	public ResponseEntity<Worker> findById(@PathVariable("id") Long id){
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		Worker obj = repo.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	
	
	
	
}
