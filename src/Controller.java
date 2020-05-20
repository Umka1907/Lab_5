import Commands.*;
import citis.DataCities;
import citis.Enter;
import citis.FileCity;

import javax.xml.bind.JAXBException;

public class Controller {
    public static void main(String[] args) throws JAXBException {

        FileCity fileCity = new FileCity();
        Boolean flag = true;

        try {

            DataCities dataCities = fileCity.readFromXML(args[0]);
            Enter enterCommand = new Enter();

            AddCommand addCommand = new AddCommand();
            AddIfMinCommand addIfMinCommand = new AddIfMinCommand();
            ClearCommand clearCommand = new ClearCommand();
            ExitCommand exitCommand = new ExitCommand();
            RemoveByIdCommand removeByIdCommand = new RemoveByIdCommand();
            UpdateCommand updateCommand = new UpdateCommand();
            MaxByMetersAboveSeaLevelCommand maxByMetersAboveSeaLevelCommand = new MaxByMetersAboveSeaLevelCommand();
            ShowCommand showCommand = new ShowCommand();
            RemoveGreaterCommand removeGreaterCommand = new RemoveGreaterCommand();
            GroupCountingByGovernmentCommand groupCountingByGovernmentCommand = new GroupCountingByGovernmentCommand();
            HelpCommand helpCommand = new HelpCommand();
            InfoCommand infoCommand = new InfoCommand();
            FilterContainsNameCommand filterContainsNameCommand = new FilterContainsNameCommand();
            HistoryCommand historyCommand = new HistoryCommand();
            SaveCommand saveCommand = new SaveCommand();
            ExecuteScriptCommand executeScriptCommand = new ExecuteScriptCommand();

            while (flag) {

                String command = enterCommand.enterCommand();
                CommandExecutor commandExecutor = new CommandExecutor();
                commandExecutor.execute(command, dataCities);
                System.out.println("________________________________________________________________________________");

            }
        }catch (Exception e){
            System.out.println("Error "+ e);
        }
    }
}
