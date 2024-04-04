/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.model;

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
    private String price;

    public Room() {
    }

    public Room(Long id, String roomNumber, String type, String status, String price) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room [id=" + id + ", price=" + price + ", roomNumber=" + roomNumber + ", type=" + type + "]";
    }

}
