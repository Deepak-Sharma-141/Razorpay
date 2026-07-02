package com.deepakproject.razorpay.payment.mapper;

import com.deepakproject.razorpay.payment.dto.response.OrderResponse;
import com.deepakproject.razorpay.payment.entity.OrderRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

    OrderResponse toResponse(OrderRecord orderRecord);
}
