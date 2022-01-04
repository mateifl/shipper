package ro.zizicu.shipper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.zizicu.nwbase.controller.BasicOperationsController;
import ro.zizicu.shipper.entities.Shipper;

@RestController
@RequestMapping(value = "shippers")
public class ShipperController 
		extends BasicOperationsController<Shipper, Integer> {

}
