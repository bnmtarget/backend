package com.service;
import com.token.AbstractToken;
import com.exceptions.TokenCreationException;
public class TokenService {
    public String createJwtToken(AbstractToken token) throws TokenCreationException {
    String issues;   //JSON Web Token
    TokenService(@Value("${com.digilibrary.service.jwt.issuer}") final String issuer, @Value("${com.digilibrary.service.jwt.secret}") final String jwtSecret, @Value("${com.digilibrary.service.jwt.exp.milli}") final Long jwtExpTTLMilli) {
        this.issuer = issuer;
        this.jwtSecret = jwtSecret;
        this.jwtExpTTLMilli = jwtExpTTLMilli;
        this.gson = new GsonBuilder().create();
        this.algorithm = Algorithm.HMAC256(jwtSecret);
        this.jwtVerifier = JWT.require(algorithm)
                .withIssuer(issuer)
                .build();
    }
        try {
            return JWT.create()
                    .withIssuer(issuer)
                    .withExpiresAt(new Date(System.currentTimeMillis() + jwtExpTTLMilli))
                    .withJWTId(String.valueOf(UUID.randomUUID()))
                    .withClaim(PAYLOAD_KEY, serializePayload(token))
                    .sign(algorithm);

        } catch (JWTCreationException exception) {
            //Invalid Signing configuration / Couldn't convert Claims.
            log.error("Error while creating jwt token: {}", exception);
            throw new TokenCreationException(TOKEN_INVALID);
        }

    }
}
