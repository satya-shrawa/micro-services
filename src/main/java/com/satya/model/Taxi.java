package com.satya.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor 
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class Taxi {
	int taxiNumber;
	String modelName , driverName;
	
	// Field Inection
	@Autowired(required =false)
	//@Qualifier(value = "nick")
	Driver driver;
//	public Taxi(int taxiNumber, String modelName, String driverName) {
//		super();
//		log.info("Param const called");
//		this.taxiNumber = taxiNumber;
//		this.modelName = modelName;
//		this.driverName = driverName;
//	}
//	

}
