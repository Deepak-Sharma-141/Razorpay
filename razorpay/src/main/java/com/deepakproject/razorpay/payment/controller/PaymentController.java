package com.deepakproject.razorpay.payment.controller;

import com.deepakproject.razorpay.payment.dto.request.PaymentInitRequestDto;
import com.deepakproject.razorpay.payment.dto.response.PaymentResponse;
import com.deepakproject.razorpay.payment.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/v1/payments")
@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;
    UUID merchantId = UUID.fromString("");

    @PostMapping
    public ResponseEntity<PaymentResponse> initiate(@Valid @RequestBody PaymentInitRequestDto request){
       return ResponseEntity.status(HttpStatus.CREATED)
               .body(paymentService.initiate(merchantId, request));
    }

}
