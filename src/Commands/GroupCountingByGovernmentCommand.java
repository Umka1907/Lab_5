package Commands;

import citis.City;
import citis.DataCities;

import java.util.ArrayList;

public class GroupCountingByGovernmentCommand implements Command {
    public GroupCountingByGovernmentCommand(){CommandExecutor.addCommand("group_counting_by_government", this);}

    @Override
    public void execute(String str, DataCities data) {
        if(!data.cities.isEmpty()){
            ArrayList<City> groupGERONTOCRACY = new ArrayList<>();
            ArrayList<City> groupMERITOCRACY = new ArrayList<>();
            ArrayList<City> groupDEMOCRACY = new ArrayList<>();

            for(City city: data.cities) {
                switch (city.getGovernment()) {
                    case DEMOCRACY:
                        groupDEMOCRACY.add(city);
                        break;
                    case MERITOCRACY:
                        groupMERITOCRACY.add(city);
                        break;
                    case GERONTOCRACY:
                        groupGERONTOCRACY.add(city);
                        break;
                }
            }

            System.out.println("group DEMOCRACY: "+ groupDEMOCRACY.size());
            System.out.println("group MERITOCRACY: "+ groupMERITOCRACY.size());
            System.out.println("group GERONTOCRACY: "+ groupGERONTOCRACY.size());
        } else {
            System.out.println("Коллекция пуста. ");
        }
    }
}
