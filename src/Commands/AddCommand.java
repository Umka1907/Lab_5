package Commands;

import citis.City;
import citis.DataCities;
import citis.DataNewCity;

public class AddCommand implements Command {
    public AddCommand(){
        CommandExecutor.addCommand("add",this);
    }

    @Override
    public void execute(String str, DataCities data) {
        City city = DataNewCity.newCity();
        data.addElement(city);
        System.out.println("Новый элемент добывлен :\n" + city.toString());


    }
}
