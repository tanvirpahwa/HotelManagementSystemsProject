/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdevuoit3230.HotelManagementProject.model.ProvidedService;

import jakarta.transaction.Transactional;
/**
 * 
 */
@Repository
public interface ServiceRepository extends JpaRepository<ProvidedService, Long> {
    List<ProvidedService> findByName(String name);

    @Transactional
    default ProvidedService addService(ProvidedService service) {
        return save(service);
    }

    default List<ProvidedService> getAllServices() {
        return findAll();
    }
}
