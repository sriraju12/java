package com.hcl.gic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.gic.model.Tasks;

public interface TaskRepo extends JpaRepository<Tasks, Integer> {

}
