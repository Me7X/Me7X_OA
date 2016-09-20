package com.me7x.oa.service.impl;

import com.me7x.oa.dao.PersonDao;
import com.me7x.oa.domain.Person;
import com.me7x.oa.service.PersonService;

public class PersonServiceImpl implements PersonService{
	
	private PersonDao personDao;

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.savePerson(person);
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	
}
