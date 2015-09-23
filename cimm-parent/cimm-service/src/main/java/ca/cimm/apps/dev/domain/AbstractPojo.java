package ca.cimm.apps.dev.domain;

import java.io.Serializable;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.joda.time.DateTime;

import ca.cimm.apps.dev.domain.listener.AbstractPojoListener;

@EntityListeners(value = { AbstractPojoListener.class })
public abstract class AbstractPojo implements Serializable {

	@Transient
	private static final long serialVersionUID = -8821356089548498279L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Version
	private int version;

	@Temporal(TemporalType.TIMESTAMP)
	private DateTime created;

	@Temporal(TemporalType.TIMESTAMP)
	private DateTime updated;

	@Temporal(TemporalType.TIMESTAMP)
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
