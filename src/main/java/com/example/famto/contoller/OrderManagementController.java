package com.example.famto.contoller;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.famto.entity.OrderManagement;
import com.example.famto.exception.ResourceNotFoundException;
import com.example.famto.repository.OrderManagementRepo;



@RestController
@RequestMapping("/api/order-management")


public class OrderManagementController {
	
	@Autowired
	private OrderManagementRepo orderManagementRepo;

	// get all products
	@GetMapping
	public List<OrderManagement> getAllOrders() {
		return this.orderManagementRepo.findAll();
		
	}

	// get Order by id
	@GetMapping("/{orderId}")
	public OrderManagement getOrderById(@PathVariable (value = "orderId") int orderId) {
		return this.orderManagementRepo.findById(orderId).
				orElseThrow(() -> new ResourceNotFoundException("Order not found with orderId"));
	}

	// create Order
	@PostMapping
	
	public OrderManagement createOrder(@RequestBody OrderManagement orderManagement) {
		return this.orderManagementRepo.save(orderManagement);
	
	}
	
	// update Order data
	@PutMapping("/{orderId}")
	public OrderManagement updateLogin(@RequestBody OrderManagement orderManagement, @PathVariable ("orderId") int orderId) {
		OrderManagement existingOrder = this.orderManagementRepo.findById(orderId)
			.orElseThrow(() -> new ResourceNotFoundException("Order not found with orderId"));
		
		if(orderManagement.getCustomerData() != null) {
			existingOrder.setCustomerData(orderManagement.getCustomerData());
		}

		
		if(orderManagement.getDeliveryMethod() != null) {
			existingOrder.setDeliveryMethod(orderManagement.getDeliveryMethod());
		}
		
		if(orderManagement.getDeliveryAgent() != null) {
			existingOrder.setDeliveryAgent(orderManagement.getDeliveryAgent());
		}
		
		if(orderManagement.getPickupAddress() != null) {
			existingOrder.setPickupAddress(orderManagement.getPickupAddress());
		}
		
		if(orderManagement.getPickupName() != null) {
			existingOrder.setPickupName(orderManagement.getPickupName());
		}
		
		if(orderManagement.getPickupPhone() != null) {
			existingOrder.setPickupPhone(orderManagement.getPickupPhone());
		}
		
		if(orderManagement.getPickupEmail() != null) {
			existingOrder.setPickupEmail(orderManagement.getPickupEmail());
		}
		
		if(orderManagement.getOrderStatus() != null) {
			existingOrder.setOrderStatus(orderManagement.getOrderStatus());
		}
		
		if(orderManagement.getDeliveryAddress() != null) {
			existingOrder.setDeliveryAddress(orderManagement.getDeliveryAddress());
		}
		
		if(orderManagement.getDeliveryOption() != null) {
			existingOrder.setDeliveryOption(orderManagement.getDeliveryOption());
		}
		
		if(orderManagement.getRestaurantDetails() != null) {
			existingOrder.setRestaurantDetails(orderManagement.getRestaurantDetails());
		}
		
		if(orderManagement.getProductsData() != null) {
			existingOrder.setProductsData(orderManagement.getProductsData());
		}
		
		if(orderManagement.getSuggestions() != null) {
			existingOrder.setSuggestions(orderManagement.getSuggestions());
		}
		
		if(orderManagement.getInvoice() != null) {
			existingOrder.setInvoice(orderManagement.getInvoice());
		}
		
		if(orderManagement.getPaymentMode() != null) {
			existingOrder.setPaymentMode(orderManagement.getPaymentMode());
		}
		if(orderManagement.getPaymentStatus() != null) {
			existingOrder.setPaymentStatus(orderManagement.getPaymentStatus());
		}
		if(orderManagement.getRating() != null) {
			existingOrder.setRating(orderManagement.getRating());
		}
		if(orderManagement.getOrderPreparationTime() != null) {
			existingOrder.setOrderPreparationTime(orderManagement.getOrderPreparationTime());
		}
		if(orderManagement.getDeviceType() != null) {
			existingOrder.setDeviceType(orderManagement.getDeviceType());
		}
		if(orderManagement.getOrderTime() != null) {
			existingOrder.setOrderTime(orderManagement.getOrderTime());
		}
		if(orderManagement.getScheduledDeliveryTime() != null) {
			existingOrder.setScheduledDeliveryTime(orderManagement.getScheduledDeliveryTime());
		}
		 return this.orderManagementRepo.save(existingOrder);
	}
	
	@DeleteMapping("/{orderId}")
	public ResponseEntity<OrderManagement> deleteOrdert(@PathVariable ("orderId") int orderId){
		OrderManagement existingOrder = this.orderManagementRepo.findById(orderId)
					.orElseThrow(() -> new ResourceNotFoundException("Order not found with id :" + orderId));
		 this.orderManagementRepo.delete(existingOrder);
		 return ResponseEntity.ok().build();
	} 
	
}
