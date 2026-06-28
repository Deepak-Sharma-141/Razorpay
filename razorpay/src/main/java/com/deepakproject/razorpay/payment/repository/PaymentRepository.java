package com.deepakproject.razorpay.payment.repository;

import com.deepakproject.razorpay.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {
}
