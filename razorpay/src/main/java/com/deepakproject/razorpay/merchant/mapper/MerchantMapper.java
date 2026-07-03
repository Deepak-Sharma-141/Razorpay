package com.deepakproject.razorpay.merchant.mapper;

import com.deepakproject.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.deepakproject.razorpay.merchant.dto.response.MerchantResponse;
import com.deepakproject.razorpay.merchant.entities.Merchant;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MerchantMapper {

    Merchant toEntityFromSignUpRequest(MerchantSignupRequest request);

    MerchantResponse toResponse(Merchant merchant);
}
