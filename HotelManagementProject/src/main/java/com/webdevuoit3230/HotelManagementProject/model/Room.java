/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
public class Room {
    @Id
    private Long id;
    private String roomNumber;
    private String type;
    private BigDecimal price;

    public Room() {
    }

    public Room(Long id, String roomNumber, String type, BigDecimal price) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room [id=" + id + ", price=" + price + ", roomNumber=" + roomNumber + ", type=" + type + "]";
    }

}
