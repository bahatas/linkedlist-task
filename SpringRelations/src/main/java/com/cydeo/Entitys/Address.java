package com.cydeo.Entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor

public class Address extends BaseEntity {
    String description;
    String zipCode;
    String state;//todo add relationship
}
