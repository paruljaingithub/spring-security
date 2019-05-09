package com.security.authdemo.config;

//@Configuration
public class SecurityConfig /* extends WebSecurityConfigurerAdapter */{

	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("parul").password("{noop}password").roles("ADMIN");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	}*/
	
	// override below method if you want to implement security for specific controller
	
  /*	@Override
	 protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();
	}*/
	
	

}
