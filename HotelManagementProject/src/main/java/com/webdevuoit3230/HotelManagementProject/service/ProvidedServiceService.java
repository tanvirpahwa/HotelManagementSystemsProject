package com.webdevuoit3230.HotelManagementProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webdevuoit3230.HotelManagementProject.model.ProvidedService;
import com.webdevuoit3230.HotelManagementProject.repository.ServiceRepository;

@Service
public class ProvidedServiceService {
    private final ServiceRepository serviceRepository;

    public ProvidedServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    
    public List<ProvidedService> getAllProvidedServices() {
        return serviceRepository.findAll();
    }

    public void addProvidedService(ProvidedService providedService) {
        if (providedService != null) {
            serviceRepository.save(providedService);
        } else {
            // Handle the case where providedService is null
            throw new IllegalArgumentException("ProvidedService cannot be null");
        }
    }

    // Add similar methods for update and delete operations
        
}
