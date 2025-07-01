package com.microservice.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="order_entry")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntry {

    private long id;
    private String skuCode;
    private BigDecimal price;
    private Integer qty;


}
