package com.alataf.banking.dto;

import lombok.Data;

@Data
public class AccountDto {

    /**
     * @Data annotation means-
     * Getters for all fields
     * Setters for all non-final fields
     * toString method
     * equals and hashCode methods
     * A constructor that initializes all final fields and any fields that are marked as @NonNull
     */

    private Long id;
    private String accountHolderName;
    private double balance;
}
