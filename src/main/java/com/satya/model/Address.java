package com.satya.model;

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
public class Address {

	 String addressLin1,addressLine2,city;
	 long pinCode;
}
