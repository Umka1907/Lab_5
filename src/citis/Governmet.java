package citis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * The class of governmet  of the city
 */
@XmlEnum (String.class)
public enum Governmet  {
    @XmlEnumValue("GERONTOCRACY") GERONTOCRACY,
    @XmlEnumValue("MERITOCRACY")MERITOCRACY,
    @XmlEnumValue("DEMOCRACY")DEMOCRACY;


}
