/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webdevuoit3230.HotelManagementProject.model.Room;
import com.webdevuoit3230.HotelManagementProject.repository.RoomRepository;

/**
 * 
 */
@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public void addRoom(Room room) {
        if (room != null) {
            roomRepository.save(room);
        } else {
            // Handle the case where room is null
            throw new IllegalArgumentException("Room cannot be null");
        }
    }

    // Add similar methods for update and delete operations
    
}
