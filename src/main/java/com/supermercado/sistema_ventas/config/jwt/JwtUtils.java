package com.supermercado.sistema_ventas.config.jwt;

import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;

@Service
public class JwtUtils {

    // Base 64Key obtained from application.properties
    @Value("${jwt.secret.key}")
    private String secretKeyString;

    @Value("${jwt.time.expiration}")
    private Long timeExpiration;

    private SecretKey getSigningKey() {
        // Decodificar de Base64 y crear una SecretKey válida para HS256
        byte[] decodedKey = Base64.getDecoder().decode(secretKeyString);
        return Keys.hmacShaKeyFor(decodedKey);
    }

    // Methods updated to the latest verions of the library
    public String generateAcessToken(String subject) {
        SecretKey signingKey = getSigningKey();

        return Jwts.builder()
                .subject(subject)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + timeExpiration))
                .signWith(signingKey)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .verifyWith(getSigningKey())
                    .build()
                    .parseSignedClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
