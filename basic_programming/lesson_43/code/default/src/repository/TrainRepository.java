package repository;

import entity.Schedule;

import java.util.List;

public interface TrainRepository {

    List<Schedule> getSchedule();

    boolean deleteFromSchedule(String trainName);

    boolean addToSchedule(Schedule schedule);

}
