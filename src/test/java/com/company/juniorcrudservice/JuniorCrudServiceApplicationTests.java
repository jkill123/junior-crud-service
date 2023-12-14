package com.company.juniorcrudservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class JuniorCrudServiceApplicationTests {

    @InjectMocks
    private JuniorCrudServiceApplication juniorCrudServiceApplication;

    @Test
    void onStartup() {
        assertNotNull(juniorCrudServiceApplication);
    }
}
