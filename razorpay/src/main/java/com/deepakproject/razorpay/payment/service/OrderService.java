package com.deepakproject.razorpay.payment.service;

import com.deepakproject.razorpay.payment.dto.request.CreateOrderRequest;
import com.deepakproject.razorpay.payment.dto.response.OrderResponse;

import java.util.UUID;

public interface OrderService {
    OrderResponse create(UUID merchantId, CreateOrderRequest request);
}
