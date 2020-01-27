package net.cfxp.methodsecurity.service;

import net.cfxp.methodsecurity.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.endpoint.SecurityContext;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;

@Service
public class UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepo;

    @Secured("ROLE_VIEWER")
    public String getUsername(){
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return securityContext.getAuthentication().getName();
    }

    @Secured({"ROLE_VIEWER", "ROLE_EDITOR"})
    public boolean isValidUsername(String username){
        return userRoleRepo.isValidUsername(username);
    }

    @RolesAllowed("ROLE_VIEWER")
    public String getUsename2(){
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return securityContext.getAuthentication().getName();
    }

    @RolesAllowed({"ROLE_VIEWER", "ROLE_EDITOR"})
    public boolean isValidUsername2(String username){
        return userRoleRepo.isValidUsername(username);
    }

    @PreAuthorize("hasRole('ROLE_VIEWER')")
    public String getUsernameInUpperCase(){
        return getUsername().toUpperCase();
    }
}
