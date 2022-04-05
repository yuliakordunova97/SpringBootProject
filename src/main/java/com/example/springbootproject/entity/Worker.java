package com.example.springbootproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Worker {

    @Id
    private int id;
    private String name;
    private double salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "worker_info")
    private WorkerInfo workerInfo;

    @ManyToOne
    @JoinColumn(name = "departure_id", nullable = false)
    private Departure departure;


}
