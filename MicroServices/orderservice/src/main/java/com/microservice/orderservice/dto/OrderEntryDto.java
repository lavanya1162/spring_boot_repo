package com.microservice.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntryDto {
    private long id;
    private String skuCode;
    private BigDecimal price;
    private Integer qty;
}
