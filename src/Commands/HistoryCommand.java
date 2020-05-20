package Commands;

import citis.DataCities;
import citis.Enter;

public class HistoryCommand implements Command {
    public HistoryCommand(){CommandExecutor.addCommand("history", this);}

    @Override
    public void execute(String str, DataCities data) {
        Enter enterCommand = new Enter();

        for (String command: enterCommand.getCommands()){
            System.out.println(command);
        }

    }
}
