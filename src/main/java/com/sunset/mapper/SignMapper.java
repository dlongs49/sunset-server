package com.sunset.mapper;

import com.sunset.entity.RegisterEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SignMapper {
    int RegisterInsert(RegisterEntity registerEntity);
    RegisterEntity FindUserPhone(String phone);

    RegisterEntity FindUserInfo(String uid);
    RegisterEntity FindIsPassword(String phone);
}
