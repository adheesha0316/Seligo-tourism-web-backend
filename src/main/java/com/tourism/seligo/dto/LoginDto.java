package com.tourism.seligo.dto;

import com.tourism.seligo.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private String email;
    private String token;
    private Role role;
}
