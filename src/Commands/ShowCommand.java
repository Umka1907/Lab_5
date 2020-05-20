package Commands;

import citis.DataCities;

public class ShowCommand implements Command {
    public ShowCommand(){CommandExecutor.addCommand("show", this);}

    @Override
    public void execute(String str, DataCities data) {
        if(data.cities.size() != 0 ) {
            data.everyoneElements();
        } else {
            System.out.println("Коллекция не имеет элементовм.");
        }

    }
}
