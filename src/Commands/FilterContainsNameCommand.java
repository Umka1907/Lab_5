package Commands;

import citis.City;
import citis.DataCities;

public class FilterContainsNameCommand implements Command {
    public FilterContainsNameCommand(){CommandExecutor.addCommand("filter_contains_name", this);}

    @Override
    public void execute(String str, DataCities data) {
        for(City city: data.filterName(str)){
            System.out.println(city);
        }

    }
}
