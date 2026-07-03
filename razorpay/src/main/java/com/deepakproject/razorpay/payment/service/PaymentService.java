package com.deepakproject.razorpay.payment.service;

import com.deepakproject.razorpay.payment.dto.request.PaymentInitRequestDto;
import com.deepakproject.razorpay.payment.dto.response.PaymentResponse;

import java.util.UUID;

public interface PaymentService {

    PaymentResponse initiate(UUID merchantId, PaymentInitRequestDto request);
}
