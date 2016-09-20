package com.me7x.oa.test;

import org.junit.Test;

import com.me7x.oa.service.PersonService;

public class PersonTest extends BaseSpring {

	@Test
	public void testSavePerson() {
		PersonService personService = (PersonService)context.getBean("personService");
	}
}
