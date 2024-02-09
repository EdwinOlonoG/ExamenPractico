package com.walmart.test.service;

import com.walmart.test.VO.Response;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service

public class TestService {
    public List<String> countDuplicated(List<String> arr1, List<String> arr2)  {
        /*if(arr1.isEmpty()){
            throw new Exception("Bad Request ArrayA");
        }
        if(arr2.isEmpty()){
            throw new Exception("Bad Request ArrayB");
        }*/
        System.out.println(arr1);
        System.out.println(arr2);
        List<String> ArrayC = new ArrayList<String>();

        for(int i = 0; i < arr2.size(); i++){
            for(int j = 0; j < arr1.size(); j++){
                if(arr2.get(i).equals(arr1.get(j))){
                    ArrayC.add(arr2.get(i));
                }
            }
        }
        int count = 0;
        List<Integer> conteo = new ArrayList<Integer>();
        Response response = new Response();
        for(int i = 0; i < ArrayC.size(); i ++){
            for(int j = 1; j < ArrayC.size(); j++) {
                if(ArrayC.get(i).equals(ArrayC.get(j))){
                    ArrayC.remove(i+1);
                    count = count + 1;
                }
                conteo.add(count);
            }
            count = 0;
        }

        response.setArrayC(ArrayC);
        response.setConteo(conteo);
        return ArrayC;
    }

}
