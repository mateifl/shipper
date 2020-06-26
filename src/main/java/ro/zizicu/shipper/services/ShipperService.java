package ro.zizicu.shipper.services;

import java.util.List;

import ro.zizicu.shipper.entities.Shipper;

public interface ShipperService extends CrudService<Shipper, Integer>  {

	List<Shipper> findByName(String name);
}
