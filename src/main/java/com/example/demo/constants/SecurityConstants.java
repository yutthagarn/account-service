package com.example.demo.constants;

public class SecurityConstants {
    public static final String SECRET = "java-rock-star";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String REGISTER_URL = "/api/user/register";
}
