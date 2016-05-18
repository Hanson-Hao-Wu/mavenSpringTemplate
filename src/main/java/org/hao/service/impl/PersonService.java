package org.hao.service.impl;

import org.hao.dao.IPersonDao;
import org.hao.service.IPersonService;

public class PersonService implements IPersonService {

	private IPersonDao personDao;
	
	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}
	
	@Override
	public void processSave() {

		System.out.println("<-----------------from PersonService.processSave()----------------->");
		personDao.save();
	}

}
