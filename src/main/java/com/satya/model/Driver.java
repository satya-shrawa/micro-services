package com.satya.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Component(value = "cabDriver")
public class Driver {

	int driverId;
	String driverName;
	long mobileNumber;
	Address address;
}
