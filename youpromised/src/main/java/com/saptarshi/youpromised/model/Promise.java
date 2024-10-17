package com.saptarshi.youpromised.model;

import lombok.Data;

import java.util.List;

@Data
public class Promise {
    List<String> madeBy;
    List<String> madeTo;
    String promiseHash;
    public Promise(List<String> madeBy, List<String> madeTo, String promiseHash) {
        this.madeBy = madeBy;
        this.madeTo = madeTo;
        this.promiseHash = promiseHash;     
        
    }
}
