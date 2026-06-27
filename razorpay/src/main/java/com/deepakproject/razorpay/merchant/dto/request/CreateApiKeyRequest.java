package com.deepakproject.razorpay.merchant.dto.request;

import com.deepakproject.razorpay.common.enums.Enviroment;

public record CreateApiKeyRequest(

        Enviroment enviroment
){
}
