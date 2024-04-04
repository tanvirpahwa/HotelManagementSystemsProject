/**
 * 
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.RoomService;

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
