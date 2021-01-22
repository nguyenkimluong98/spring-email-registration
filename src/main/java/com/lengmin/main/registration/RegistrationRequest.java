package com.lengmin.main.registration;

import lombok.Data;

/**
 * @author luongnk@viettel.com.vn
 */

@Data
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
