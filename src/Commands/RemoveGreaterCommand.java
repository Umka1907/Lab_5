package Commands;

import citis.City;
import citis.DataCities;

import java.util.LinkedHashSet;

public class RemoveGreaterCommand implements Command {

    public RemoveGreaterCommand(){CommandExecutor.addCommand("remove_greater", this);}

    @Override
    public void execute(String str, DataCities data) {
        if(str != null){
            City city = new City();
            city.setName(str);
            LinkedHashSet<City>  removeElement = data.removeGreater(city);
            System.out.println("Эти элементы были удалены: ");
            for (City city1: removeElement ){
                System.out.println(city1);
            }
        }else {System.out.println("Неправильно введина коменда");}

    }
}
