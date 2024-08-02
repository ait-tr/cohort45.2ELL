package controller;

import entity.Schedule;
import service.TrainService;

import java.util.List;
import java.util.Scanner;

public class TrainController {

    private Scanner scanner;
    private TrainService trainService;

    public TrainController(Scanner scanner, TrainService trainService) {
        this.scanner = scanner;
        this.trainService = trainService;
    }

    public void startProgram() {
        while (true) {
            String commandLine = scanner.nextLine();
            Command command = Command.valueOf(commandLine);

            switch (command) {
                case GET_SCHEDULE -> getSchedule();
                case DELETE_FROM_SCHEDULE -> deleteFromSchedule();
                case ADD_TO_SCHEDULE -> addToSchedule();
            }
        }
    }

    private void getSchedule() {
        List<Schedule> list = trainService.getSchedule();

        for (Schedule schedule : list) {
            System.out.println(schedule);
        }
    }

    private void deleteFromSchedule() {
        System.out.println("Введите номер поезда:");
        String trainNumber = scanner.nextLine();

        boolean isCompleted = trainService.deleteFromSchedule(trainNumber);

        if (isCompleted) {
            System.out.println("Успешно удалено");
        }
        else {
            System.out.println("Удалить не получилось");
        }
    }

    private void addToSchedule() {
        System.out.println("В одной строке введите через пробел номер поезда, дату его выезда и приезда");
        String data = scanner.nextLine();

        boolean isCompleted = trainService.addToSchedule(data);

        if (isCompleted) {
            System.out.println("Успешно добавлено");
        }
        else {
            System.out.println("Добавить не получилось");
        }
    }

}
