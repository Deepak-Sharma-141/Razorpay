package com.deepakproject.razorpay.merchant.mapper;

import com.deepakproject.razorpay.merchant.dto.response.ApiKeyCreateResponse;
import com.deepakproject.razorpay.merchant.dto.response.ApiKeyResponse;
import com.deepakproject.razorpay.merchant.entities.ApiKey;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ApiKeyMapper {

    ApiKeyCreateResponse toCreateResponse(ApiKey apiKey);

    List<ApiKeyResponse> toResponseList(List<ApiKey> apiKeyList);
}
