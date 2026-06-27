package com.deepakproject.razorpay.merchant.repository;

import com.deepakproject.razorpay.merchant.entities.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApiKeyRepository extends JpaRepository<ApiKey, UUID> {
}
