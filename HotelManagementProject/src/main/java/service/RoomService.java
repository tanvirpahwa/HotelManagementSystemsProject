/**
 * 
 */
package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.RoomRepository;

/**
 * 
 */
@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public RoomRepository getRoomRepository() {
        return roomRepository;
    }
    
}
