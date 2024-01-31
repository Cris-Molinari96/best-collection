package com.example.testapplication.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseHttp <T> {
    private T objectSource;
//    private List<T> objectListSource;
    private String messageException;

    @Override
    public String toString() {
        return "ResponseHttp{" +
                "objectSource=" + objectSource +
                ", messageException='" + messageException + '\'' +
                '}';
    }
}
