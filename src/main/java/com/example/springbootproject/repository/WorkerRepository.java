package com.example.springbootproject.repository;

import com.example.springbootproject.entity.Departure;
import com.example.springbootproject.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {

    @Query("select w from Worker as w where w.departure.id = :departureId")
    List<Worker> findAllByDepartureId(@Param("departureId") int departureId);

    @Query("select w from Worker as w where w.id = :id")
    Worker findWorkerById(@Param("id") int id);

    @Query("select w from Worker as w where w.name = :name")
    Worker findWorkerByName(@Param("name") String name);

}

//    Worker findWorkerByDeparture(Departure departure);
//
//
//    @Query("select d from Departure as d where d.name = :name")
