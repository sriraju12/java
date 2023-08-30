package com.hcl.gic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.gic.model.Tasks;
import com.hcl.gic.repository.TaskRepo;

@Service
public class TaskService {

	@Autowired
	TaskRepo repo;

	public void add(Tasks task) {
		repo.save(task);
	}

	public List<Tasks> getAllTask() {
		return repo.findAll();
	}

	public void deleteTaskById(int id) {
		repo.deleteById(id);
	}

	public void editTask(Tasks task) {
		repo.save(task);
	}

}
