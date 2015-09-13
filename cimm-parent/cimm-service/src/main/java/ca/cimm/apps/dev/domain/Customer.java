package ca.cimm.apps.dev.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Customer.TABLE_NAME)
public class Customer extends AbstractPojo {

	public static final String TABLE_NAME = "CUSTOMER";

	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	@Embedded
	private Adresse adresse;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
