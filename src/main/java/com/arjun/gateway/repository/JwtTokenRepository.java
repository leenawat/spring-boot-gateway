package com.arjun.gateway.repository;

import com.arjun.gateway.bean.auth.JwtToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtTokenRepository extends JpaRepository<JwtToken, String> {
}
