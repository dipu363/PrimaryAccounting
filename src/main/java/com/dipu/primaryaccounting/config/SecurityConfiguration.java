package com.dipu.primaryaccounting.config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author User
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/admindeshboard").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/userauthorizationpage").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/showAuthorpage").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/showmenuctrlpage").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/addaccounthead").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/showaccountholderpage").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/journalctrlpage").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/showuserauthorizationctrlpage").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/paymentvoucherctrlpage").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/receivedvoucherctrlpage").access("hasRole('ROLE_ADMIN')")
               
                .and().formLogin().loginPage("/login").loginProcessingUrl("/perform_login")
                .successForwardUrl("/loginsuccess").usernameParameter("username")
                .passwordParameter("userpassword").failureUrl("/login")
                .and().logout().logoutUrl("/logout")
                .logoutSuccessUrl("/").invalidateHttpSession(true)
                .and().csrf().disable();
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("in security.............");
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select emailid, password, status from UserRole where emailid=? and status='True'")
                .authoritiesByUsernameQuery("select emailid,role from UserRole where emailid=?");
    }

}
