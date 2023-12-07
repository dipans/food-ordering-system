package com.food.ordering.system.order.service.domain.ports.input.message.listener.payment;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;

import javax.validation.Valid;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproval(@Valid RestaurantApprovalResponse restaurantApprovalResponse);
    void orderRejected(@Valid RestaurantApprovalResponse restaurantApprovalResponse);

}
