package com.example.demo.service;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Events {
	
	@Id
	private int events_id;
	
	private String event_name;
	
	private Date event_time;

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public Date getEvent_time() {
		return event_time;
	}

	public void setEvent_time(Date event_time) {
		this.event_time = event_time;
	}

	public int getEvents_id() {
		return events_id;
	}
	
}
