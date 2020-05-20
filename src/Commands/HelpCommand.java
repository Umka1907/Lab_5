package Commands;

import citis.DataCities;

public class HelpCommand implements Command {
    public HelpCommand(){CommandExecutor.addCommand("help", this);}

    @Override
    public void execute(String str, DataCities data) {
        System.out.println("help: Вывести справку по доступным командам;");
        System.out.println("info: Вывести информацию о коллекции; ");
        System.out.println("show: Вывести  все элементы коллекции;");
        System.out.println("add: Добавить новый элемент в коллекцию");
        System.out.println("update:   Обновить значение элемента коллекции, id которого равен заданному");
        System.out.println("remove_by_id: Удалить элемент из коллекции по его id; ");
        System.out.println("clear: Очистить коллекцию;");
        System.out.println("save: Сохранить коллекцию в файл;");
        System.out.println("execute_script: Считать и исполнить скрипт из указанного файла;");
        System.out.println("exit: Завершить программу (без сохранения в файл);");
        System.out.println("add_if_min: Добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции;");
        System.out.println("remove_greater: Удалить из коллекции все элементы, превышающие заданный;");
        System.out.println("history: Вывести последние 7 команд (без их аргументов);");
        System.out.println("max_by_meters_above_sea_level: Вывести любой объект из коллекции, значение поля metersAboveSeaLevel которого является максимальным;");
        System.out.println("group_counting_by_government: Сгруппировать элементы коллекции по значению поля government, вывести количество элементов в каждой группе; ");
        System.out.println("filter_contains_name: Вывести элементы, значение поля name которых содержит заданную подстроку;");

    }
}


