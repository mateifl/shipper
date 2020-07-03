package ro.zizicu.shipper.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ro.zizicu.nwbase.entity.IdentityOwner;


@Entity
@Table(name = "shippers")
public class Shipper implements IdentityOwner<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shipperid")
	private Integer id;
	@Column(name="companyname")
	private String companyName;
	private String phone;

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer shipperId) {
		this.id = shipperId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
