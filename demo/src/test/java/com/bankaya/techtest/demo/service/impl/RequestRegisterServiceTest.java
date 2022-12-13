package com.bankaya.techtest.demo.service.impl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bankaya.techtest.demo.model.Register;
import com.bankaya.techtest.demo.repository.IRegisterRepository;

@ExtendWith(MockitoExtension.class)
public class RequestRegisterServiceTest {

  @Mock
  private IRegisterRepository registerRepository;
  @InjectMocks
  private RequestRegisterService registerService;

  @BeforeEach
  void init() {
    assertNotNull(registerRepository);
    assertNotNull(registerService);
  }

  @Test
  void testRegisterRequest() {

      when(registerRepository.save(any(Register.class))).thenReturn(new Register());

    assertDoesNotThrow(() -> registerService.registerRequest("abilities", "127.0.0.0"));
  }
}
