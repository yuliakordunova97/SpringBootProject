package com.example.springbootproject.dto;

import com.example.springbootproject.entity.Departure;
import com.example.springbootproject.entity.WorkerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
    public class WorkerDto {

        private int id;
        private String name;
        private double salary;
        private Departure departure;
        private WorkerInfo workerInfo;
}
