package com.saptarshi.youpromised.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class EtchInEthService implements EtchInBlockChainService{
    @Override
    public String doSomething(){
        return "Etching in Ethereum";
    };
}
