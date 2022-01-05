package com.disney.disneyworld.model.mapper;

import com.disney.disneyworld.model.entity.UserEntity;
import com.disney.disneyworld.model.request.RegisterRequest;
import com.disney.disneyworld.model.response.RegisterResponse;
import org.apache.coyote.Request;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(RegisterRequest registerRequest){
    return UserEntity.builder()
            .username(registerRequest.getUsername())
            .password(registerRequest.getPassword())
            .build();
    }

    public RegisterResponse toDTO(UserEntity userEntity){
        return RegisterResponse.builder()
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())

                .build();
    }
}
