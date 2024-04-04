/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdevuoit3230.HotelManagementProject.model.Room;

/**
 * 
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
    List<Room> findByRoomNumber(String roomNumber);
}
