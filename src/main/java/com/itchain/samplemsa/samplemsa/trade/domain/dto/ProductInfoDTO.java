package com.itchain.samplemsa.samplemsa.trade.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductInfoDTO {
    private String productId;
    private String buyerId;
    private int price;
    private int quantity;
}