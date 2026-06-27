package com.deepakproject.razorpay.merchant.dto.response;

import com.deepakproject.razorpay.common.enums.Enviroment;

import java.util.UUID;

public record ApiKeyCreateResponse(
        UUID id,
        String keyId,
        String keySecret,
        Enviroment environment
) {
}
