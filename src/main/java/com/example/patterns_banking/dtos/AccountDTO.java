package com.example.patterns_banking.dtos;

import com.example.patterns_banking.enumerate.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
  private String number;
  private AccountType type;
  private BigDecimal balance;
  private Boolean isActive;
}
