package Commands;

import citis.DataCities;

public class ClearCommand implements Command {
    public ClearCommand(){CommandExecutor.addCommand("clear", this);}

    @Override
    public void execute(String str, DataCities data) {
        if (data.cities.isEmpty()){
            System.out.println("Коллекция и так пуста. ");
        }else {
            data.clearCollection();
            System.out.println("Все элементы коллекции удалены. ");
        }
    }
}
