package com.satya;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.satya.model.Address;
import com.satya.model.Driver;
import com.satya.model.Taxi;
import com.satya2.model.Driver2;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = "com")
public class TaxiServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TaxiServiceApplication.class, args);

		/*
		 * Taxi bmw = ctx.getBean("bmw1", Taxi.class); log.info(bmw.toString());
		 */
//		Driver vicky = (Driver) ctx.getBean("cabDriver"); // no qualifying bean
//		log.info(vicky.toString());

		Driver nick = (Driver) ctx.getBean("nick"); // no qualifying bean
		log.info(nick.toString());

		//System.out.println("is Singleton: =" + ctx.isSingleton("cabDriver"));
		System.out.println("is prototype: =" + ctx.isPrototype("nick"));

		ctx.close();
		/*
		 * Driver2 nick2 = (Driver2) ctx.getBean("cabDriver2"); // no qualifying bean
		 * log.info(nick2.toString());
		 */
	}

	// factory method
	@Bean
	// @Lazy(value=true)
	public Taxi bmw() {
		// constructor DI
		// return new Taxi(12, "BMW","Vishal");
		Taxi taxi = new Taxi();
		taxi.setModelName("BMW- C");
		return taxi;
	}
	/*@Bean
	@Lazy(value = true)
	public Taxi bmw1() {
		// constructor DI
		return new Taxi(12, "BMW", "Vishal");
		/*
		 * Taxi taxi = new Taxi(); taxi.setModelName("BMW1- C"); return taxi;
		 
	} */

	@Bean
	// @Scope("prototype")
	@Primary
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Driver nick() {

		return new Driver(3030, "Nikhil", 123,addr()); // method reference
	}
	
	@Bean
	public Address addr() {
		
		return new Address("add1","add2","pune",123);
	}

}
