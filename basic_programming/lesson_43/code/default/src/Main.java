import controller.TrainController;
import repository.TrainListRepositoryImpl;
import repository.TrainRepository;
import service.TrainService;
import service.TrainServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrainRepository trainRepository = new TrainListRepositoryImpl();
        TrainService trainService = new TrainServiceImpl(trainRepository);
        TrainController trainController = new TrainController(scanner, trainService);

        trainController.startProgram();
    }
}
