package service;

import entity.Schedule;
import repository.TrainRepository;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class TrainServiceImpl implements TrainService {

    private TrainRepository trainRepository;

    public TrainServiceImpl(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @Override
    public List<Schedule> getSchedule() {
        return trainRepository.getSchedule();
    }

    @Override
    public boolean deleteFromSchedule(String trainName) {
        return trainRepository.deleteFromSchedule(trainName);
    }

    @Override
    public boolean addToSchedule(String data) {
        if (data == null) {
            return false;
        }

        String[] stringArray = data.split(" ");

        if (stringArray.length != 3) {
            return false;
        }

        String trainName = stringArray[0];
        LocalDate start;
        LocalDate finish;

        try {
            start = LocalDate.parse(stringArray[1]);
            finish = LocalDate.parse(stringArray[2]);
        }
        catch (DateTimeParseException e) {
            return false;
        }

        Schedule schedule = new Schedule(trainName, start, finish);

        boolean result = trainRepository.addToSchedule(schedule);
        return result;
    }
}
