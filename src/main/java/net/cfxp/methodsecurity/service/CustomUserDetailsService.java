package net.cfxp.methodsecurity.service;

import net.cfxp.methodsecurity.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service("userDetailService")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    UserRoleRepository userRoleRepo;

    @Override
    public UserDetails loadUserByUsername(String username){
        return userRoleRepo.loadUserByUserName((username));
    }
}
