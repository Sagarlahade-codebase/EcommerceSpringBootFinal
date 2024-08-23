package com.sagar.lahade.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

import com.sagar.lahade.ecommerce.dto.Purchase;
import com.sagar.lahade.ecommerce.dto.PurchaseResponse;
import com.sagar.lahade.ecommerce.service.CheckoutService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}









