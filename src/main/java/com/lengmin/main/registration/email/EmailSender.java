package com.lengmin.main.registration.email;

/**
 * @author luongnk@viettel.com.vn
 */

public interface EmailSender {
    void send(String to, String email);
}
