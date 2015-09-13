package ca.cimm.apps.dev.domain;

import javax.persistence.Id;

import org.joda.time.DateTime;

public class AbstractPojo {
	
	@Id
	private Long id;
	
	private DateTime created;
	
	private DateTime updated;
	
	private DateTime end;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DateTime getCreated() {
		return created;
	}

	public void setCreated(DateTime created) {
		this.created = created;
	}

	public DateTime getUpdated() {
		return updated;
	}

	public void setUpdated(DateTime updated) {
		this.updated = updated;
	}

	public DateTime getEnd() {
		return end;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}
	
}
