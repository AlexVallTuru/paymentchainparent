package com.paymentchain.transaction.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String reference;
    private String iban;
    private Date date;
    private double amount;
    private double fee;
    private String description;
    private String status; // 01:Pendiente 02:Liquidada 03:Rechazada 04:Cancelada
    private String channel; // WEB CAJERO OFICINA

}