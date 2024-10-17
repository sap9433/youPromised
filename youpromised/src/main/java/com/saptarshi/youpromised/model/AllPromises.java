package com.saptarshi.youpromised.model;

import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class AllPromises {
    List<Promise> all;

    public AllPromises() {
        this.all = new ArrayList();
        Promise p1 = new Promise(Arrays.asList("saptarshi"), Arrays.asList("XYZ"), "p1");
        Promise p2 = new Promise(Arrays.asList("ABC"), Arrays.asList("MNL"), "p2");
        all.add(p2);
        all.add(p1);
    }
    public List<Promise> getAll() {
        return all;
    }
}
