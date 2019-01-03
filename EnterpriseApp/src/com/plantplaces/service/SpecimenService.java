package com.plantplaces.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.plantplaces.dao.ISpecimenDao;
import com.plantplaces.dto.Specimen;

@Named
public class SpecimenService implements ISpecimenService {

	@Inject
	private ISpecimenDao specimenDao;
	
	
	

	@Override
	public void addSpecimen(Specimen specimen) {
		specimenDao.addSpecimen(specimen);
	}





	public ISpecimenDao getSpecimenDao() {
		return specimenDao;
	}

	public void setSpecimenDao(ISpecimenDao specimenDao) {
		this.specimenDao = specimenDao;
	}

}
