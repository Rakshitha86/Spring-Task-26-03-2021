package com.xworkz.washmachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String xml = "spring.xml";
		ApplicationContext applicationContextConfig = new ClassPathXmlApplicationContext(xml);

		WashingMachine washMachine = applicationContextConfig.getBean(WashingMachine.class);
		System.out.println(washMachine.getBrand());
		System.out.println(washMachine.getColor());

		System.out.println("       ");

		System.out.println("Wrapper Classes");

		Integer integerType = applicationContextConfig.getBean(Integer.class);
		System.out.println(integerType);

		Byte bytesType = applicationContextConfig.getBean(Byte.class);
		System.out.println(bytesType);

		Short shortType = applicationContextConfig.getBean(Short.class);
		System.out.println(shortType);

		Long longType = applicationContextConfig.getBean(Long.class);
		System.out.println(longType);

		Float floatType = applicationContextConfig.getBean(Float.class);
		System.out.println(floatType);

		Double doubleType = applicationContextConfig.getBean(Double.class);
		System.out.println(doubleType);

		Character charType = applicationContextConfig.getBean(Character.class);
		System.out.println(charType);

		String stringType = applicationContextConfig.getBean(String.class);
		System.out.println(stringType);

		Boolean booleanType = applicationContextConfig.getBean(Boolean.class);
		System.out.println(booleanType);
	}

}
