package com.webdevuoit3230.HotelManagementProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Customer customerid;
    @ManyToOne
    private Room roomid;
    private String startDate;
    private String endDate;

    public Booking() {
    }

    public Booking(Long id, Customer customerid, Room roomid, String startDate, String endDate) {
        this.id = id;
        this.customerid = customerid;
        this.roomid = roomid;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Room getRoomid() {
        return roomid;
    }

    public void setRoomid(Room roomid) {
        this.roomid = roomid;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking [customerid=" + customerid + ", endDate=" + endDate + ", id=" + id + ", roomid=" + roomid
                + ", startDate=" + startDate + "]";
    }
}
