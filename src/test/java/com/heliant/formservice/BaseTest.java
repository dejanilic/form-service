package com.heliant.formservice;

import org.springframework.test.context.ActiveProfiles;

// Za testove koristimo novi profil, kako bismo imali mogucnost da koristimo test bazu, a ne npr. produkcionu.
@ActiveProfiles("test")
public class BaseTest {
}
