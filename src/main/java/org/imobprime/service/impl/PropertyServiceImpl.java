package org.imobprime.service.impl;

import java.util.List;

import org.imobprime.controller.PropertySearchDTO;
import org.imobprime.dao.PropertyDAO;
import org.imobprime.model.Property;
import org.imobprime.repository.PropertyRepository;
import org.imobprime.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	PropertyRepository propertyRepository;
	
	@Autowired
	PropertyDAO propertyDAO;
	
	@Override
	public List<Property> findAll() {
		return propertyDAO.findAll();
	}

	@Override
	public List<Property> findAll(PropertySearchDTO propertySearchDTO) {
		return propertyDAO.findAll(propertySearchDTO);
	}

	@Override
	public Property findById(Integer propertyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Property property) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Property property) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer propertyId) {
		// TODO Auto-generated method stub
		
	}

}
