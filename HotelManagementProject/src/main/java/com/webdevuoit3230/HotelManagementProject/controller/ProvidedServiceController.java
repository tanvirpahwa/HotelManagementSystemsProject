/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.webdevuoit3230.HotelManagementProject.service.ProvidedServiceService;

/**
 * 
 */
@Controller
public class ProvidedServiceController {
    @Autowired
    private ProvidedServiceService providedServiceService;
    public ProvidedServiceController(ProvidedServiceService providedServiceService) {
        this.providedServiceService = providedServiceService;
    }
    public ProvidedServiceService getProvidedServiceService() {
        return providedServiceService;
    }
    
}
