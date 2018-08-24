package com.itchain.samplemsa.samplemsa.trade.port.adapter.service;

import com.itchain.samplemsa.samplemsa.trade.domain.DeliverStatus;
import com.itchain.samplemsa.samplemsa.trade.domain.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServieImpl implements DeliveryService {

    @Autowired
    HttpDeliveryAdapter httpDeliveryAdapter;

    public boolean IsAvailableToCancel(String id) {
        DeliverStatus deliverStatus = httpDeliveryAdapter.getDeliveryStatusByTradeId(id);

        if (deliverStatus == DeliverStatus.PREPARE) {
            return true;
        } else {
            return false;
        }
    }
}
