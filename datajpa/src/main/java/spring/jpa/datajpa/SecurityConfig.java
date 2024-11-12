package spring.jpa.datajpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // In-memory user details service to configure users and their roles
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails admin = User.withUsername("Gani")
                .password(encoder.encode("Gani123"))
                .roles("ADMIN")
                .build();
        UserDetails user = User.withUsername("user")
                .password(encoder.encode("user123"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);  // Users are stored in memory
    }

    // Configuring HTTP security (authentication and authorization)
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()  // Disable CSRF for simplicity (consider enabling it in production)
            .authorizeHttpRequests()
                // Only ADMIN can create a category (POST /categories/create)
                .requestMatchers("/categories/create").hasRole("ADMIN")
                // Only ADMIN can delete a category by code (DELETE /categories/codes/{code})
                .requestMatchers("/categories/codes/**").hasRole("ADMIN")
                // Both ADMIN and USER can read categories (GET /categories and /categories/**)
                .requestMatchers("/categories/**").hasAnyRole("ADMIN", "USER")
                // All other requests must be authenticated
                .anyRequest().authenticated()
            .and()
            .httpBasic();  // Use HTTP Basic Authentication for simplicity

        return http.build();  // Build the security filter chain
    }

    // Password Encoder Bean for password encryption
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Use BCrypt for password encoding
    }
}
