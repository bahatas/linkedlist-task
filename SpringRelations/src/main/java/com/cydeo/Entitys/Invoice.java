package com.cydeo.Entitys;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "invoices")
public class Invoice extends BaseEntity{

    private LocalDate invoiceDate;
    private Long invoiceNumber;
    private String invoiceType;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;


}
