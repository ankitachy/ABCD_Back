package com.pack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Wishlist")
public class WishList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "wishlistId")
	private int wishlistId;
	
	@Column(name = "eventId")
	private long eventId;

	@Column(name = "userId")
	private int userId;

	@Column(name = "userName")
	private String username;

	@Column(name = "eventType")
	private String eventType;

	@Column(name = "datetime_utc")
	private String datetime_utc;

	@Column(name = "venueName")
	private String venueName;

	@Column(name = "venueCapacity")
	private String venueCapacity;

	@Column(name = "performerName")
	private String performerName;

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getDatetime_utc() {
		return datetime_utc;
	}

	public void setDatetime_utc(String datetime_utc) {
		this.datetime_utc = datetime_utc;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getVenueCapacity() {
		return venueCapacity;
	}

	public void setVenueCapacity(String venueCapacity) {
		this.venueCapacity = venueCapacity;
	}

	public String getPerformerName() {
		return performerName;
	}

	public void setPerformerName(String performerName) {
		this.performerName = performerName;
	}

	public WishList(int wishlistId, long eventId, int userId, String username, String eventType, String datetime_utc,
			String venueName, String venueCapacity, String performerName) {
		super();
		this.wishlistId = wishlistId;
		this.eventId = eventId;
		this.userId = userId;
		this.username = username;
		this.eventType = eventType;
		this.datetime_utc = datetime_utc;
		this.venueName = venueName;
		this.venueCapacity = venueCapacity;
		this.performerName = performerName;
	}

	public WishList() {
		
	}
	
	
	
}
