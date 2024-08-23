package com.sagar.lahade.ecommerce.dto;

import lombok.Data;

import java.util.Set;

import com.sagar.lahade.ecommerce.entity.Address;
import com.sagar.lahade.ecommerce.entity.Customer;
import com.sagar.lahade.ecommerce.entity.Order;
import com.sagar.lahade.ecommerce.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
