package com.deepakproject.razorpay.payment.service.impl;

import com.deepakproject.razorpay.common.enums.PaymentMethod;
import com.deepakproject.razorpay.payment.dto.request.PaymentInitRequestDto;
import com.deepakproject.razorpay.payment.dto.response.PaymentResponse;
import com.deepakproject.razorpay.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentResponse initiate(UUID merchantId, PaymentInitRequestDto request) {

        return null;
    }
}
