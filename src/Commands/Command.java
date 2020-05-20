package Commands;
import citis.DataCities;

import javax.xml.bind.JAXBException;

public interface Command {
    void execute(String str, DataCities data) ;
}
