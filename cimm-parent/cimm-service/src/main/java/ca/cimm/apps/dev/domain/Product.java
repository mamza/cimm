package ca.cimm.apps.dev.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = Product.TABLE_NAME)
public class Product extends AbstractPojo {

	@Transient
	private static final long serialVersionUID = -296095896034941833L;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barCode == null) ? 0 : barCode.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (barCode == null) {
			if (other.barCode != null) {
				return false;
			}
		} else if (!barCode.equals(other.barCode)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=");
		builder.append(name);
		builder.append(", barCode=");
		builder.append(barCode);
		builder.append("]");
		return builder.toString();
	}

}
