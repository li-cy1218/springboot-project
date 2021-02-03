package demo.config.service;

import demo.config.entity.UserManager;
import demo.entity.User;
import demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SecurityService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserManager userManager;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User userDetail = userMapper.getUserDetail(name);
        if (userDetail == null) {
            throw new UsernameNotFoundException("用户名或密码错误.");
        }
        userManager.setUserName(userDetail.getEmail());
        userManager.setPassWord(userDetail.getPassword());
        List<GrantedAuthority> list = new ArrayList<>();
        switch (userDetail.getRole()) {
            case "1": list.add(new SimpleGrantedAuthority("USER")); break;
            case "2": list.add(new SimpleGrantedAuthority("ADMIN")); break;
            default:
        }
        userManager.setGrantedAuthority(list);

        return userManager;
    }
}
