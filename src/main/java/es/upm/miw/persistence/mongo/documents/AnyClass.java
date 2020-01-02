package es.upm.miw.persistence.mongo.documents;

import java.io.Serializable;

public class AnyClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer number;

    private String value;

    public AnyClass() {
    }

    public AnyClass(int number, String value) {
        this.number = number;
        this.value = value;
    }

    @Override
    public String toString() {
        return "AnyClass [number=" + number + ", value=" + value + "]";
    }

    public Integer getNumber() {
        return number;
    }

    public String getValue() {
        return value;
    }

}
