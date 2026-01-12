package com.soa.tutorial.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
