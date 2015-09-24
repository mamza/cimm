package ca.cimm.apps.dev.domain;

import java.io.Serializable;

import javax.persistence.Convert;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.joda.time.DateTime;

import ca.cimm.apps.dev.domain.converter.JodaTimeConverter;
import ca.cimm.apps.dev.domain.listener.AbstractPojoListener;

@MappedSuperclass
@EntityListeners(value = { AbstractPojoListener.class })
public abstract class AbstractPojo implements Serializable {

	@Transient
	private static final long serialVersionUID = -8821356089548498279L;

	@Id
	@GeneratedValue
	protected Long id;

	@Version
	private int version;

	@Temporal(TemporalType.TIMESTAMP)
	@Convert(converter = JodaTimeConverter.class)
	private DateTime created;

	@Temporal(TemporalType.TIMESTAMP)
	@Convert(converter = JodaTimeConverter.class)
	private DateTime updated;

	@Temporal(TemporalType.TIMESTAMP)
	@Convert(converter = JodaTimeConverter.class)
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
