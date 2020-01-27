package net.cfxp.methodsecurity.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class SystemService {
    public String getSystemYear(){
        return "2019";
    }

    public String getSystemDate(){
        return "25-02-2020";
    }
}
