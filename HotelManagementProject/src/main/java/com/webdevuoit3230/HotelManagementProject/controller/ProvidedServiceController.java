package com.webdevuoit3230.HotelManagementProject.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.webdevuoit3230.HotelManagementProject.model.ProvidedService;
import com.webdevuoit3230.HotelManagementProject.service.ProvidedServiceService;

@Controller
@RequestMapping("/services")
public class ProvidedServiceController {
    private final ProvidedServiceService providedServiceService;

    public ProvidedServiceController(ProvidedServiceService providedServiceService) {
        this.providedServiceService = providedServiceService;
    }
    
    @GetMapping
    public String showProvidedService(Model model) {
        model.addAttribute("services", providedServiceService.getAllProvidedServices());
        model.addAttribute("service", new ProvidedService());
        return "services";
    }

    @GetMapping("/add")
    public String showAddProvidedServiceForm(Model model) {
        model.addAttribute("service", new ProvidedService());
        return "addService";
    }

    @PostMapping("/add")
    public String addProvidedService(@ModelAttribute ProvidedService providedService) {
        providedServiceService.addProvidedService(providedService);
        return "redirect:/services";
    }
    
    
}
