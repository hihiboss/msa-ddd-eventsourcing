package com.itchain.samplemsa.samplemsa.product.domain.event;

import com.itchain.samplemsa.samplemsa.common.Event;
import lombok.Getter;

@Getter
public class ProductUpdateEvent implements Event {
    private String id;
    private String productName;
    private String description;
    private int price;

    public ProductUpdateEvent(String productId, String productName, String description, int price) {
        this.id = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getID() {
        return id;
    }
}
