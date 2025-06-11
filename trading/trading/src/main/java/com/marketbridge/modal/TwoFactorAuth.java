package com.marketbridge.modal;

import com.marketbridge.domain.VerificationType;

import lombok.Data;

@Data
public class TwoFactorAuth {
   private boolean isEnabled=false;
   private VerificationType sendTo;
}
