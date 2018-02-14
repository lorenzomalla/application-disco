package com.discogest.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan( basePackages = {"com.discogest.model"})
//@ComponentScan(basePackages ={"com.accenture.dsg.backend.controller"})
@EnableJpaRepositories("com.discogest.dao")
@SpringBootApplication(scanBasePackages={"com.discogest.controller","com.discogest..dao"},
exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);
    }
//   
//    @EnableWebSecurity
//    class MultiHttpSecurityConfig {
    	
//      @Autowired
//      public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
////    	  auth.jdbcAuthentication().dataSource(dataSource)
////  		.usersByUsernameQuery(
////  			"SELECT mail , password FROM Users WHERE mail=?");
//          auth 
//              .inMemoryAuthentication()
////              INIZIALIZZO IL RUOLO A USER E SCELGO UN USERNAME E PASSWORD
////              DA CONTROLLARE COME RECUPERARE QUESTI DATI DA DB
//                  .withUser("a").password("b").roles("USER").and();
//          //NEL CASO SI VUOLE ACCEDERE COME ADMIN
////                  .withUser("admin").password("password").roles("USER", "ADMIN");
//
//      }
//    }
//    @Configuration
//    @Order(2)
//    public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
//    	@Override
//    	public void configure(WebSecurity web) throws Exception {
//    		//IGNORO LE PAGINE DOVE NON HANNO BISOGNO DI AUTENTICAZIONE 
//    		web
//    	        .ignoring()
//    	        .antMatchers("/","/home","/supporto");
//    		//IGNORO TUTTE LE RISORSE STATICHE (CSS,JS ETC) ALTRIMENTI NON VERRA VISUALIZZATA
//    		//CORRETTAMENTE LA PAGINA CORRENTE.
//    		 web.ignoring().antMatchers("src/main/resoruces/static/**");
//    	}
//    	protected void configure(HttpSecurity http) throws Exception {
//        	
//        	/*
//             * MAPPO TUTTI I SERVIZI CHE RICHIEDONO L'AUTENTICAZIONE
//             * E QUINDI RITORNANDO IL FORM DI LOGIN
//             */
////    		http
////            .authorizeRequests()
////            .antMatchers("/resources/static/**").permitAll()
////            .anyRequest().authenticated();
//        	http.antMatcher("/api/**").authorizeRequests().anyRequest().hasRole("USER").and().formLogin()
//        	.loginPage("/login")
////        	.usernameParameter("mail").passwordParameter("password")
//        	.and().httpBasic();
//        }
//    }   
//    @Configuration
//    public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
////            AUTORIZZO LA RICHIESTA AFFINCHE' SI E' AUTENTICATI
//                .authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and()
//                .formLogin();
//        }
//    }
}
  
