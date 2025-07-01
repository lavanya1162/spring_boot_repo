package com.microservice.orderservice.service;

import com.microservice.orderservice.dto.OrderEntryDto;
import com.microservice.orderservice.dto.OrderRequest;
import com.microservice.orderservice.model.Order;
import com.microservice.orderservice.model.OrderEntry;
import com.microservice.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

private final OrderRepository orderRepository;
    public void placeorder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderEntry> orderEntries = orderRequest.getOrderEntryDtoList().stream()
                                       .map(this :: mapToOrderEntryDto).toList() ;
       order.setOrderEntries(orderEntries);
        orderRepository.save(order);
    }

    private OrderEntry mapToOrderEntryDto(OrderEntryDto orderEntryDto){
     OrderEntry orderEntry=new OrderEntry();
        orderEntry.setPrice(orderEntryDto.getPrice());
        orderEntry.setSkuCode(orderEntryDto.getSkuCode());
        orderEntry.setQty(orderEntryDto.getQty());
        return orderEntry;
    }
}
