package com.demo.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
private String user;
private String email;
private String password;
private String status;
}
