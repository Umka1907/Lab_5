package Commands;

import citis.City;
import citis.DataCities;
import citis.DataNewCity;

public class AddIfMinCommand implements Command{
    public AddIfMinCommand(){CommandExecutor.addCommand("add_if_min", this);}

    @Override
    public void execute(String str, DataCities data) {
        City newElement = DataNewCity.newCity();
        if(data.ifMinValues(newElement) == true){
            data.addElement(newElement);
            System.out.println("Ваш объект добавлен в коллекцию." );
        } else {
            System.out.println("\n" +
                    "Значение вашего элемента не меньше чем минимальное у значений из коллекции");
        }

    }
}
