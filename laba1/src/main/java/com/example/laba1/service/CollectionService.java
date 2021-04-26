package com.example.laba1.service;

import com.example.laba1.parametrs.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;

@Service

public class CollectionService {

    ArrayList<Max> list = new ArrayList<>();

    public void addElement(Max max){
        list.add(max);
    }

    public String readCollection() {
        StringBuilder data = new StringBuilder("");

        for (Max max : list){
            data.append(max);
        }
        return data.toString();
    }

    public void sortCollection(){
        Collections.sort(list);
    }

    public void clearCollection(){
        list.clear();
    }
}
