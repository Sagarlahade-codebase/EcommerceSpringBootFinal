package com.sagar.lahade.ecommerce.service;

import com.sagar.lahade.ecommerce.dto.Purchase;
import com.sagar.lahade.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
