package com.deepakproject.razorpay.merchant.service;

import com.deepakproject.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.deepakproject.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);
}
