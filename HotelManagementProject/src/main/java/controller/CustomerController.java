/**
 * 
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String showCustomer () {
        return "customer";
    }
    
    @Autowired
    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    public CustomerService getCustomerService() {
        return customerService;
    }
}
