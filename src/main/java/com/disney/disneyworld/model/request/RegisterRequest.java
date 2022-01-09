package com.disney.disneyworld.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterRequest {

    private String username;

    private String password;

}
