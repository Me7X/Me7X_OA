package com.me7x.oa.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.me7x.oa.dao.PersonDao;
import com.me7x.oa.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao {

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}


}