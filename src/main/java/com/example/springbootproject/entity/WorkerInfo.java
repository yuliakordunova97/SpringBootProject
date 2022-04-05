package com.example.springbootproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Accessors(chain = true)
public class WorkerInfo {

    //@Column(name = "id", nullable = false)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String homeAddress;
    private int age;
//    @OneToOne(mappedBy = "workerInfo")
//    @JoinColumn(name = "worker", nullable = false)
//    private Worker worker;
}
