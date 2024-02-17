package com.example.famto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.famto.entity.OrderManagement;


@Repository

public interface OrderManagementRepo extends JpaRepository<OrderManagement, Integer>{
	

}