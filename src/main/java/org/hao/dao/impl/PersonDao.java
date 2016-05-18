package org.hao.dao.impl;

import org.hao.dao.IPersonDao;

public class PersonDao implements IPersonDao {

	@Override
	public void save() {
		
		System.out.println("<-----------------from PersonDao.save()----------------->");
	}

}
