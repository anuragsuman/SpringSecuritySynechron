package com.spring.security.jwt.example.mapper;

import com.spring.security.jwt.example.constant.IdType;
import com.spring.security.jwt.example.entity.User;
import com.spring.security.jwt.example.model.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
imports = {IdType.class,LocalDateTime.class})
public interface UserMapper {

    @Mappings(
            @Mapping(target = "id",source = "id")
    )
    public UserDTO map(User user);

}
