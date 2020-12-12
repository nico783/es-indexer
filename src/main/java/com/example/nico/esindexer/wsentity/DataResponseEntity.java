package com.example.nico.esindexer.wsentity;

import java.io.Serializable;
import java.util.List;

public class DataResponseEntity implements Serializable {

    private String count;
    private List<ResultEntity> results;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ResultEntity> getResults() {
        return results;
    }

    public void setResults(List<ResultEntity> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "DataResponseEntity{" +
                "count='" + count + '\'' +
                ", results=" + results +
                '}';
    }
}
