package com.walmart.test.VO;

import java.util.List;

public class Response {
    List<String> arrayC;
    List<Integer> conteo;

    public void Response(List<String> arrayc, List<Integer> conteo) {
        this.arrayC = arrayc;
        this.conteo = conteo;
    }

    public void setArrayC(List<String> arrayC) {
        this.arrayC = arrayC;
    }

    public void setConteo(List<Integer> conteo) {
        this.conteo = conteo;
    }
}
