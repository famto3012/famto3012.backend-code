package com.example.famto.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.geo.Point;


@Entity
@Getter
@Setter
@Table(name = "delivey_person_registration")

public class DeliveryPersonRegistration {

	public DeliveryPersonRegistration(long deliveryUserId, String phoneNumber, String name, String firstName,
			String lastName, String email, String userName, String password, String team, String role, String type,
			String geofence, String transportType, String transportDescription, String licensePlate, String color,
			String address, String pan, String photo, String aadhaar, String drivingLicense, Boolean availability,
			Point geometry, Double latitude, Double longitude, String status, String vehicleRegistration,
			String emergencyContact) {
		super();
		this.deliveryUserId = deliveryUserId;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.team = team;
		this.role = role;
		this.type = type;
		this.geofence = geofence;
		this.transportType = transportType;
		this.transportDescription = transportDescription;
		this.licensePlate = licensePlate;
		this.color = color;
		this.address = address;
		this.pan = pan;
		this.photo = photo;
		this.aadhaar = aadhaar;
		this.drivingLicense = drivingLicense;
		this.availability = availability;
		this.geometry = geometry;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
		this.vehicleRegistration = vehicleRegistration;
		this.emergencyContact = emergencyContact;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long deliveryUserId;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password", unique = true)
	private String password;
	
	@Column(name = "team")
	private String team;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "geofence")
	private String geofence;
	
	@Column(name = "transport_type")
	private String transportType;
	
	@Column(name = "transport_description")
	private String transportDescription;
	
	@Column(name = "license_plate")
	private String licensePlate;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "address")
	private String address;
	
	////
	@Column(name = "pan")
	private String pan;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "aadhaar")
	private String aadhaar;
	
	@Column(name = "driving_license")
	private String drivingLicense;
	
	@Column(name = "availability")
	private Boolean availability;
	
	@Column(columnDefinition = "geometry")
	 private Point geometry;
	
	@Column(name = "latitude")
	private Double latitude;
	
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}


	@Column(name = "longitude")
	private Double longitude;
	
//	@Convert(converter = RestaurantTagsModel.class)
//	@Column(name = "tags")
//	private List<String> tags = new ArrayList<>();
////	
//	public List<String> getTags() {
//		return tags;
//	}
//	public void setTags(List<String> tags) {
//		this.tags = tags;
//	}

	public Point getGeometry() {
		return geometry;
	}

	public void setGeometry(Point geometry) {
		this.geometry = geometry;
	}

	public String getStatus() {
		return status;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name = "status")
	private String status;
	

	public long getDeliveryUserId() {
		return deliveryUserId;
	}

	public void setDeliveryUserId(long deliveryUserId) {
		this.deliveryUserId = deliveryUserId;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGeofence() {
		return geofence;
	}

	public void setGeofence(String geofence) {
		this.geofence = geofence;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getTransportDescription() {
		return transportDescription;
	}

	public void setTransportDescription(String transportDescription) {
		this.transportDescription = transportDescription;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public String getVehicleRegistration() {
		return vehicleRegistration;
	}

	public void setVehicleRegistration(String vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	@Column(name = "vehicle_registration")
	private String vehicleRegistration;
	
	@Column(name = "emergency_contact")
	private String emergencyContact;
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
