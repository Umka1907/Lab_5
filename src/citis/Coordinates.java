package citis;

import javax.xml.bind.annotation.XmlElement;

public class Coordinates  {
    @XmlElement
    private Float x; //Поле не может быть null
    @XmlElement
    private Long y; //Поле не может быть null

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(Long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                "x= " + x +
                "; y= " + y +
                '}';
    }
}