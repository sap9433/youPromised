package com.saptarshi.youpromised.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@ConditionalOnMissingBean(EtchInBlockChainService.class)
public class EtchInBTCService implements EtchInBlockChainService{
    @Override
    public String doSomething(){
        return "Etching in B";
    };
}
