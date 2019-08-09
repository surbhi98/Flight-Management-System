package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(schema ="hr" , name = "Flight100000")

public class Flight {


	@Id
	private int flightId;
	
	@Column
	private String source;
	
	@Column
	private String destination;

	@Column (name="FlightDate")
	private String date;
	
	@Column
	private int price;
	
	@Column
	private int  depTime;
	
	@Column
	private int  arrTime;
	
	
	public Flight() {
		// TODO Auto-generated constructor stub
		
		
	}


	public Flight(int flightId, String source, String destination, String date, int price, int depTime, int arrTime) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.price = price;
		this.depTime = depTime;
		this.arrTime = arrTime;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", source=" + source + ", destination=" + destination + ", date=" + date
				+ ", price=" + price + ", depTime=" + depTime + ", arrTime=" + arrTime + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + arrTime;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + depTime;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightId;
		result = prime * result + price;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (arrTime != other.arrTime)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (depTime != other.depTime)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightId != other.flightId)
			return false;
		if (price != other.price)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}


	public int getFlightId() {
		return flightId;
	}


	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getDepTime() {
		return depTime;
	}


	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}


	public int getArrTime() {
		return arrTime;
	}


	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	
}

