package demo.config;

<<<<<<< HEAD
import demo.config.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecurityService securityService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService);
=======
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("lcy").password("123456").roles("vip1","vip2")
                .and()
                .withUser("lcy").password("123456").roles("vip1","vip2");

>>>>>>> c76d43a9412afa4883e08eef45080ae3b43d8bd7
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
<<<<<<< HEAD
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/hello").hasRole("ADMIN");
=======
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/home1/**").hasRole("vip1");
>>>>>>> c76d43a9412afa4883e08eef45080ae3b43d8bd7
        http.formLogin();
    }
}
