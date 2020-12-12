package com.example.nico.esindexer.wsentity;

import java.io.Serializable;

public class CatResponseEntity implements Serializable {

    private String datetime;
    private String code;
    private DataResponseEntity data;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataResponseEntity getData() {
        return data;
    }

    public void setData(DataResponseEntity data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CatResponseEntity{" +
                "datetime='" + datetime + '\'' +
                ", code='" + code + '\'' +
                ", dataResponseEntity=" + data +
                '}';
    }
}
