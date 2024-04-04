/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdevuoit3230.HotelManagementProject.repository.ServiceRepository;

/**
 * 
 */
@Service
public class ProvidedServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    public ProvidedServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public ServiceRepository getServiceRepository() {
        return serviceRepository;
    }
        
}
