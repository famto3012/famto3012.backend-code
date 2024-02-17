package com.example.famto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.famto.entity.TaskModel;


@Repository

public interface TaskRepo extends JpaRepository<TaskModel, Integer>{
	
	
}