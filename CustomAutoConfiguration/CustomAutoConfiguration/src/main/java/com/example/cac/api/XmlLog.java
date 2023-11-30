package com.example.cac.api;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//@Service
//@Primary
public class XmlLog implements LogApi{
    @Override
    public void generate(String name) {
        System.out.println("Generating XML log file ..."+name+".xml");
    }
}
