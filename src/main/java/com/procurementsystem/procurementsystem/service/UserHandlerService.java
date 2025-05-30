package com.procurementsystem.procurementsystem.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class UserHandlerService {
    public void usernameHasText(String username){
         if(StringUtils.hasText(username)){
             return ;
         };
         log.info("username is empty");
         throw new IllegalArgumentException("username is empty");
    }
    public void phoneNumberHasText(String phoneNumber){
        if(StringUtils.hasText(phoneNumber)){
            return;
        }
        log.info("phone number is empty");
        throw new IllegalArgumentException("phone number is empty");
    }

    public Date convertStringToDate(String dateOfBirth){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(dateOfBirth);
        } catch (Exception e) {
            log.info("Error parsing date",e);
        }
        return new Date();
    }
}
