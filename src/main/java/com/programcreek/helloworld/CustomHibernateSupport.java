package com.programcreek.helloworld;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomHibernateSupport extends HibernateDaoSupport {
	@Autowired
	public void anyMethodName(SessionFactory session) {
		setSessionFactory(session);
	}
}
