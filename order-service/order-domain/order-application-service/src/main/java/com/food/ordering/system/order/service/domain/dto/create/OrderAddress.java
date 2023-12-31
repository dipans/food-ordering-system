package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@AllArgsConstructor
public class OrderAddress {
    @NotNull
    @Max(value = 50)
    private final String street;
    @NotNull
    @Max(value = 50)
    private final String city;
    @NotNull
    @Min(value = 5)
    @Max(value = 10)
    private final String zipCode;
}
