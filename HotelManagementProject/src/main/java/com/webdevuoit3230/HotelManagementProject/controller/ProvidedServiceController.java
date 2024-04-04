package com.webdevuoit3230.HotelManagementProject.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.webdevuoit3230.HotelManagementProject.model.ProvidedService;
import com.webdevuoit3230.HotelManagementProject.service.ProvidedServiceService;

@Controller
@RequestMapping("/providedServices")
public class ProvidedServiceController {
    private final ProvidedServiceService providedServiceService;

    public ProvidedServiceController(ProvidedServiceService providedServiceService) {
        this.providedServiceService = providedServiceService;
    }
    
    @GetMapping
    public String showProvidedService(Model model) {
        model.addAttribute("providedServices", providedServiceService.getAllProvidedServices());
        model.addAttribute("providedService", new ProvidedService());
        return "providedServices";
    }

    @GetMapping("/add")
    public String showAddProvidedServiceForm(Model model) {
        model.addAttribute("providedService", new ProvidedService());
        return "addProvidedService";
    }

    @PostMapping("/add")
    public String addProvidedService(@ModelAttribute ProvidedService providedService) {
        providedServiceService.addProvidedService(providedService);
        return "redirect:/providedServices";
    }
    
    
}
