package com.example.famto.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import converter.CustomerConvertorClass;
import converter.DeliveryAgentConvertorClass;
import converter.InvoiceConvertorClass;
import converter.ItemConverter;
import converter.ProductDataConvertorClass;
import converter.RestaurantDataConvertorClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_data")
public class OrderManagement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@Convert(converter = CustomerConvertorClass.class)
	@Column(columnDefinition = "json", name = "customerData")
	private CustomerData customerData;
	
	@Column(name = "deliveryMethod")
	private String deliveryMethod;
	

	@Convert(converter = DeliveryAgentConvertorClass.class)
	@Column(columnDefinition = "json", name = "deliveryAgent")
	private DeliveryPersonRegistration deliveryAgent;
	
	@Convert(converter = AddressModel.class)
	@Column(columnDefinition = "json", name = "pickupAddress")
	private AddressModel pickupAddress;
	
	@Column (name = "pickupName")
	private String pickupName;
	
	@Column (name = "pickupPhone")
	private String pickupPhone;
	
	@Column (name = "pickupEmail")
	private String pickupEmail;
	
	@Column (name = "orderStatus")
	private String orderStatus;
	
	@Convert(converter = AddressModel.class)
	@Column(columnDefinition = "json", name = "deliveryAddress")
	private AddressModel deliveryAddress;
	
	@Column (name = "deliveryOption")
	private String deliveryOption;
	
	@Convert(converter = RestaurantDataConvertorClass.class)
	@Column(columnDefinition = "json", name = "restaurantDetails")
	private RestaurantData restaurantDetails;
	
	@Convert(converter = ProductDataConvertorClass.class)
	@Column(columnDefinition = "json", name = "productsDetails")
	private List<ProductsData> productsData = new ArrayList<>();
	
	@Column (name = "suggestions")
	private String suggestions;
	
	@Convert(converter = InvoiceConvertorClass.class)
	@Column(columnDefinition = "json", name = "invoice")
	private InvoiceModel invoice;
	
	@Column (name = "paymentMode")
	private String paymentMode;
	
	@Column (name = "paymentStatus")
	private String paymentStatus;
	
	@Column (name = "rating")
	private String rating;
	
	@Column (name = "orderPreparationTime")
	private String orderPreparationTime;
	
	@Column (name = "deviceType")
	private String deviceType;
	
	@Column(name = "orderTime")
	private Date orderTime;
	
	@Column(name = "scheduledDeliveryTime")
	private Date scheduledDeliveryTime;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public CustomerData getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}

	
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}


	public String getPickupName() {
		return pickupName;
	}

	public void setPickupName(String pickupName) {
		this.pickupName = pickupName;
	}

	public String getPickupPhone() {
		return pickupPhone;
	}

	public void setPickupPhone(String pickupPhone) {
		this.pickupPhone = pickupPhone;
	}

	public String getPickupEmail() {
		return pickupEmail;
	}

	public void setPickupEmail(String pickupEmail) {
		this.pickupEmail = pickupEmail;
	}

	public String getDeliveryOption() {
		return deliveryOption;
	}

	public void setDeliveryOption(String deliveryOption) {
		this.deliveryOption = deliveryOption;
	}

	public RestaurantData getRestaurantDetails() {
		return restaurantDetails;
	}

	public void setRestaurantDetails(RestaurantData restaurantDetails) {
		this.restaurantDetails = restaurantDetails;
	}

	public List<ProductsData> getProductsData() {
		return productsData;
	}

	public void setProductsData(List<ProductsData> productsData) {
		this.productsData = productsData;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	
	public AddressModel getPickupAddress() {
		return pickupAddress;
	}


	public InvoiceModel getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceModel invoice) {
		this.invoice = invoice;
	}

	public DeliveryPersonRegistration getDeliveryAgent() {
		return deliveryAgent;
	}

	public void setDeliveryAgent(DeliveryPersonRegistration deliveryAgent) {
		this.deliveryAgent = deliveryAgent;
	}

	public AddressModel getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(AddressModel deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getOrderPreparationTime() {
		return orderPreparationTime;
	}

	public void setOrderPreparationTime(String orderPreparationTime) {
		this.orderPreparationTime = orderPreparationTime;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getScheduledDeliveryTime() {
		return scheduledDeliveryTime;
	}

	public void setScheduledDeliveryTime(Date scheduledDeliveryTime) {
		this.scheduledDeliveryTime = scheduledDeliveryTime;
	}

	public void setPickupAddress(AddressModel pickupAddress) {
		this.pickupAddress = pickupAddress;
	}


}
