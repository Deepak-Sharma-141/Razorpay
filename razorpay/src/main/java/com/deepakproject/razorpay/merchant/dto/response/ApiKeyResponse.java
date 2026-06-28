package com.deepakproject.razorpay.merchant.dto.response;

import com.deepakproject.razorpay.common.enums.Enviroment;

import java.time.LocalDateTime;
import java.util.UUID;

public record ApiKeyResponse(
        UUID id,
        String keyId,
        Enviroment enviroment,
        boolean enabled,
        LocalDateTime lastUsedAt,
        LocalDateTime createdAt
) {
}
