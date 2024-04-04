/**
 * 
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.ProvidedServiceService;

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
