package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema ="hr" , name = "Bookings100")

public class Bookings {

	@Id
	private int bookingId;
	
	@Column
	private int userId;

	@Column
	private int flightId;
	
	@Column 
	private int nop;
	
	@Column 
	private int totalprice;
	
	public Bookings() {
		
	}

	public Bookings(int bookingId, int userId, int flightId, int nop, int totalprice) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.flightId = flightId;
		this.nop = nop;
		this.totalprice = totalprice;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookingId;
		result = prime * result + flightId;
		result = prime * result + nop;
		result = prime * result + totalprice;
		result = prime * result + userId;
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
		Bookings other = (Bookings) obj;
		if (bookingId != other.bookingId)
			return false;
		if (flightId != other.flightId)
			return false;
		if (nop != other.nop)
			return false;
		if (totalprice != other.totalprice)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", userId=" + userId + ", flightId=" + flightId + ", nop=" + nop
				+ ", totalprice=" + totalprice + "]";
	}
	
	
	

	
}
