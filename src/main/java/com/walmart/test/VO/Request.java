package com.walmart.test.VO;

import java.util.List;

public class Request {

    List<String> arr1;
    List<String> arr2;

    public void Request(List<String> arr1, List<String> arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public List<String> getArr1(){
        return this.arr1;
    }
    public List<String> getArr2(){
        return this.arr2;
    }
}
