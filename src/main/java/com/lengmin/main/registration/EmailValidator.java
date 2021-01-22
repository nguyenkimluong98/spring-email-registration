package com.lengmin.main.registration;

import org.springframework.stereotype.Component;

import java.util.function.Predicate;

/**
 * @author luongnk@viettel.com.vn
 */

@Component
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return true;
    }
}
