package com.deepakproject.razorpay.merchant.service.impl;

import com.deepakproject.razorpay.common.exception.ResourceNotFoundException;
import com.deepakproject.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.deepakproject.razorpay.merchant.dto.response.ApiKeyCreateResponse;
import com.deepakproject.razorpay.merchant.entities.ApiKey;
import com.deepakproject.razorpay.merchant.entities.Merchant;
import com.deepakproject.razorpay.merchant.repository.ApiKeyRepository;
import com.deepakproject.razorpay.merchant.repository.MerchantRepository;
import com.deepakproject.razorpay.merchant.service.ApiKeyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiKeyServiceImpl implements ApiKeyService {

    private final MerchantRepository merchantRepository;
    private final ApiKeyRepository apiKeyRepository;

    @Override
    public ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request) {
        Merchant merchant = merchantRepository.findById(merchantId)
                .orElseThrow(() -> new ResourceNotFoundException("merchant", merchantId));

        String keyId = "rzp_"+request.enviroment().name().toLowerCase()+"big_random";
        String rawSecret = "big_random_secret"; //TODO: replace with cryptography random hex

        ApiKey apiKey = ApiKey.builder()
                .merchant(merchant)
                .KeyId(keyId)
                .keySecretHash(rawSecret)
                .environment(request.enviroment())
                .build();

        apiKey = apiKeyRepository.save(apiKey);


        return new ApiKeyCreateResponse(apiKey.getId(), keyId, rawSecret, request.enviroment());
    }
}
