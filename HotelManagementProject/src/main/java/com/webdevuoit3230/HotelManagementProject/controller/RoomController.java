/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.webdevuoit3230.HotelManagementProject.service.RoomService;

/**
 * 
 */
@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }
    public RoomService getRoomService() {
        return roomService;
    }
    
}
