package ro.zizicu.shipper.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ro.zizicu.shipper.data.ShipperRepository;
import ro.zizicu.shipper.entities.Shipper;
import ro.zizicu.shipper.services.ShipperService;

@Service
public class ShipperServiceImpl 
		extends CrudServiceImpl<ShipperRepository, Shipper, Integer> 
		implements ShipperService 
{

	@Override
	public List<Shipper> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
