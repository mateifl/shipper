package ro.zizicu.shipper.services;

import ro.zizicu.shipper.entities.Shipper;

public interface ExpeditionService {
	public void sendProductsToCustomer(Integer orderId, String customerId, Shipper shipper);
	
}
