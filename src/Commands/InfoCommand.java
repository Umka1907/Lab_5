package Commands;

import citis.DataCities;

public class InfoCommand implements Command {
    public InfoCommand(){CommandExecutor.addCommand("info", this);}

    @Override
    public void execute(String str, DataCities data) {
        System.out.println(data.toString());
    }
}
