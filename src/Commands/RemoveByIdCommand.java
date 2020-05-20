package Commands;

import citis.City;
import citis.DataCities;
import citis.DataNewCity;

public class RemoveByIdCommand implements Command {

    public RemoveByIdCommand(){CommandExecutor.addCommand("remove_by_id", this);}

    @Override
    public void execute(String stringId, DataCities data) {
        try{

            Integer id = Integer.parseInt(stringId);
            if (data.arrayListId().contains(id)){
                data.removeElementById(id);

                System.out.println("Элемент с " + id + " был удален");
            }else{
                System.out.println("Элемента с таким id нет в коллекции");
            }

        }catch (NumberFormatException e){
            System.out.println("Wrong id number format");
        }
    }
}
