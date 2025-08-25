package com.tourism.seligo.dto;

import com.tourism.seligo.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userName;
    private String email;
    private String password;
    private Role role; // TOURIST, GUIDE, SELLER, HOTEL_MANAGER, ADMIN
}
