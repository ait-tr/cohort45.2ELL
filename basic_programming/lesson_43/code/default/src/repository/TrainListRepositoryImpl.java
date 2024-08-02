package repository;

import entity.Schedule;

import java.util.ArrayList;
import java.util.List;

public class TrainListRepositoryImpl implements TrainRepository {

    private List<Schedule> schedules;

    public TrainListRepositoryImpl() {
        this.schedules = new ArrayList<>();
    }

    @Override
    public List<Schedule> getSchedule() {
        return schedules;
    }

    @Override
    public boolean deleteFromSchedule(String trainName) {
        Schedule trainSchedule = schedules.stream()
                .filter(schedule -> schedule.getTrainName().equals(trainName))
                .findAny()
                .orElse(null);

        if (trainSchedule == null) {
            return false;
        }

        schedules.remove(trainSchedule);
        return true;
    }

    @Override
    public boolean addToSchedule(Schedule schedule) {
        if (schedule == null) {
            return false;
        }

        schedules.add(schedule);
        return true;
    }
}
