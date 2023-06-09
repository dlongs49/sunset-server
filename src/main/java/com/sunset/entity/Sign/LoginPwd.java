package com.sunset.entity.Sign;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LoginPwd {
    @Schema(description = "手机号")
    private String phone;
    @Schema(description = "密码")
    private String password;
}
