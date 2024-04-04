/**
 * 
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.CustomerService;

/**
 * 
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    public CustomerService getCustomerService() {
        return customerService;
    }
}
