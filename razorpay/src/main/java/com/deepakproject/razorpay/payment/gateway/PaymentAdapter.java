package com.deepakproject.razorpay.payment.gateway;

import com.deepakproject.razorpay.payment.gateway.dto.PaymentRequest;

public interface PaymentAdapter {

    void initiate(PaymentRequest request);
}
