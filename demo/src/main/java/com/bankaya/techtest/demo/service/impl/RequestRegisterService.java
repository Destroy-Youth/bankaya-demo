package com.bankaya.techtest.demo.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankaya.techtest.demo.model.Register;
import com.bankaya.techtest.demo.repository.IRegisterRepository;
import com.bankaya.techtest.demo.service.IRequestRegisterService;

@Service
public class RequestRegisterService implements IRequestRegisterService {

  @Autowired
  private IRegisterRepository registerRepository;

  @Override
  public void registerRequest(String method, String ip) {
    Register register = new Register();
    register.setIp("method");
    register.setMethod(method);
    register.setRequestDate(new Date());
    registerRepository.save(register);

  }

}
