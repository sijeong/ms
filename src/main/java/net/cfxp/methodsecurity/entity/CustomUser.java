package net.cfxp.methodsecurity.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CustomUser extends User {
    @Getter
    @Setter
    private String nickName;

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities){
        super(username, password, authorities);
    }

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String nickname){
        super(username, password, authorities);
        this.nickName = nickname;
    }
}
