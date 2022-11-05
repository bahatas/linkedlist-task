package com.cydeo.Entitys;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "invoiceProduct")
public class InvoiceProduct extends BaseEntity{


    private Long profit;
    private Long quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Invoice invoice;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;


}
