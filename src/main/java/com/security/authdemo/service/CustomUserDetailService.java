package com.security.authdemo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.authdemo.model.AuthUser;
import com.security.authdemo.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
  
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		AuthUser user = userRepository.findByUsername(username);
		
		CustomUserDetails customUserDetails = null;
		if(user != null) {
			customUserDetails = new CustomUserDetails();
			customUserDetails.setUser(user);
	     } else {
			throw new UsernameNotFoundException("User does not exits with name: "+ username);
		}

		return customUserDetails;
	}
	
	
}
