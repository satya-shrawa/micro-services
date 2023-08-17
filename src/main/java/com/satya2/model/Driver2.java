package com.satya2.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component(value = "cabDriver2")
public class Driver2 {

	int driverId;
	String driverName;
	long mobileNumber;
}
