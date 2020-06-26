package ro.zizicu.shipper.data;

import org.springframework.data.repository.CrudRepository;

import ro.zizicu.shipper.entities.Shipper;

public interface ShipperRepository extends CrudRepository<Shipper, Integer> {

}
