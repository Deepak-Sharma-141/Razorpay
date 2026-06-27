package com.deepakproject.razorpay.merchant.service;


import com.deepakproject.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.deepakproject.razorpay.merchant.dto.response.ApiKeyCreateResponse;

import java.util.UUID;

public interface ApiKeyService {
    ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request);
}
