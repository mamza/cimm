package ca.cimm.apps.dev.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Product.TABLE_NAME)
public class Product extends AbstractPojo {

	public static final String TABLE_NAME = "PRODUCT";

	private String name;
	
	private String barCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

}
