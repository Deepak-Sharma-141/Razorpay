package com.deepakproject.razorpay.payment.dto.request;

import com.deepakproject.razorpay.common.entity.Money;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public record CreateOrderRequest(

        @NotNull(message = "Amount is required")
        Money amount,

        @Size(max = 100)
        String receipt,

        Map<String, Objects> notes,

        LocalDateTime expiresAt
) {
}
