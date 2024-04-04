/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.webdevuoit3230.HotelManagementProject.model.Room;
import com.webdevuoit3230.HotelManagementProject.service.RoomService;

/**
 * 
 */
@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public String showRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        model.addAttribute("room", new Room());
        return "rooms";
    }

    @GetMapping("/add")
    public String showAddRoomForm(Model model) {
        model.addAttribute("room", new Room());
        return "addRoom";
    }

    @PostMapping("/add")
    public String addRoom(@ModelAttribute Room room) {
        roomService.addRoom(room);
        return "redirect:/rooms";
    }
}
