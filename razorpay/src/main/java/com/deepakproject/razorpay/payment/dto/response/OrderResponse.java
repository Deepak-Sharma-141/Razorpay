package com.deepakproject.razorpay.payment.dto.response;

import com.deepakproject.razorpay.common.entity.Money;
import com.deepakproject.razorpay.common.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public record OrderResponse(

        UUID id,
        UUID merchantId,
        String receipt,
        Money amount,
        OrderStatus status,
        Integer attempts,
        Map<String, Objects> notes,
        LocalDateTime expiresAt,
        LocalDateTime createdAt

) {
}
