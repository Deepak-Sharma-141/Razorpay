package com.deepakproject.razorpay.merchant.service.impl;

import com.deepakproject.razorpay.common.enums.MerchantStatus;
import com.deepakproject.razorpay.common.enums.UserRole;
import com.deepakproject.razorpay.common.exception.DuplicateResourceException;
import com.deepakproject.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.deepakproject.razorpay.merchant.dto.response.MerchantResponse;
import com.deepakproject.razorpay.merchant.entities.AppUser;
import com.deepakproject.razorpay.merchant.entities.Merchant;
import com.deepakproject.razorpay.merchant.mapper.MerchantMapper;
import com.deepakproject.razorpay.merchant.repository.AppUserRepository;
import com.deepakproject.razorpay.merchant.repository.MerchantRepository;
import com.deepakproject.razorpay.merchant.service.AuthService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AppUserRepository appUserRepository;
    private final MerchantRepository merchantRepository;
    private final MerchantMapper merchantMapper;

    @Override
    @Transactional
    public MerchantResponse signup(MerchantSignupRequest request) {
        if(merchantRepository.existsByEmail(request.email())){
            throw new DuplicateResourceException("DUPLICATE_MERCHANT_EMAIL",
                    "Merchant with email already exists: "+request.email());
        }

//        Merchant merchant = Merchant.builder()
//                .businessName(request.businessName())
//                .businessType(request.businessType())
//                .name(request.name())
//                .email(request.email())
//                .status(MerchantStatus.PENDING_KYC)
//                .build();

        Merchant merchant = merchantMapper.toEntityFromSignUpRequest(request);
        merchant.setStatus(MerchantStatus.PENDING_KYC);

        merchant = merchantRepository.save(merchant);

        AppUser appUser = AppUser.builder()
                .email(request.email())
                .merchant(merchant)
                .passwordHash(request.password())
                .role(UserRole.OWNER)
                .build();

        appUserRepository.save(appUser);

//        return new MerchantResponse(merchant.getId(), merchant.getName(),
//                merchant.getEmail(), merchant.getBusinessName(),
//                merchant.getBusinessType(), merchant.getStatus());

        return merchantMapper.toResponse(merchant);
    }
}
