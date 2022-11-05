package com.cydeo.Entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.cydeo.Entitys.State;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor

public class Address extends com.cydeo.entity.BaseEntity {
    String description;
    String zipCode;
    @ManyToOne
    private State state;//todo add relationship
}
