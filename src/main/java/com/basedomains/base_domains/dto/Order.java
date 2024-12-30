package com.basedomains.base_domains.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order implements Serializable{
    private String orderId;
    private String orderName;
    private int qty;
    private double price;
}
