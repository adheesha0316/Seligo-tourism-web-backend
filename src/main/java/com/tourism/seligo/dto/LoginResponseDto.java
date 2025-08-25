package com.tourism.seligo.dto;

import com.tourism.seligo.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponseDto {
    private String email;
    private String token;
    private Role role;
    private String userName;
}
