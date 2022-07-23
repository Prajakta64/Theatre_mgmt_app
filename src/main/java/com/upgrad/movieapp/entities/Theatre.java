package com.upgrad.movieapp.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="theatre")
public class Theatre {
	
	public Theatre() {
		
	}

	public Theatre(int theatreId, String theatreName, City city) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.city = city;
		this.ticketPrice = 150.00;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="theatre_id", length=10)
	private int theatreId;
	
	@Column(name="theatre_name", length=20, nullable= false)
	private String theatreName;
	
	
	
	  @ManyToOne
	  
	  @JoinColumn(name= "city_id", nullable = false) private City city;
	 
	
	@Column(name="ticket_price")
	private double ticketPrice= 150.00;

	
	// getter setter
	
	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, theatreId, theatreName, ticketPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theatre other = (Theatre) obj;
		return Objects.equals(city, other.city) && theatreId == other.theatreId
				&& Objects.equals(theatreName, other.theatreName)
				&& Double.doubleToLongBits(ticketPrice) == Double.doubleToLongBits(other.ticketPrice);
	}

	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", ticketPrice="
				+ ticketPrice + "]";
	}
	
	
	

}
