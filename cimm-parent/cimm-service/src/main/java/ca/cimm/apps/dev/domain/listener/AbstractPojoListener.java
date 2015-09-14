package ca.cimm.apps.dev.domain.listener;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.joda.time.DateTime;

import ca.cimm.apps.dev.domain.AbstractPojo;

public class AbstractPojoListener {

	@PrePersist
	public void beforePersist(AbstractPojo p){
		p.setCreated(new DateTime());
	}
	
	@PreUpdate
	public void beforeUpdate(AbstractPojo p){
		p.setUpdated(new DateTime());
	}
	
}
