package com.example.cac.api;

import org.springframework.stereotype.Service;

public class JsonLog implements LogApi{
    @Override
    public void generate(String name) {
        System.out.println("Generating JSON log file ..."+name+".json");
    }
}
