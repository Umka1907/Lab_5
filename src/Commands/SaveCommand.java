package Commands;

import citis.DataCities;
import citis.FileCity;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class SaveCommand implements Command {
    public SaveCommand(){CommandExecutor.addCommand("save", this);}

    @Override
    public void execute(String str, DataCities data)  {
        try {
            if (str != null) {
                FileCity fileCity = new FileCity();
                fileCity.convertObjectToXml(data, str);
                System.out.println("Ваша коллекция была сохраннена в файл: " + str);
            } else {
                System.out.println("Вы забыли указать имя файла");
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
