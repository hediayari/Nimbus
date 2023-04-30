package com.example.projetnimbus.DAO.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cmdId;
    String nomcmd;
    String mailcmd;
    float prixcmd;
    String addrcmd;
    @Enumerated(EnumType.STRING)
    PaymentFormality paymentFormality ;
    float fraisLiv;
    float tva;
    float prixTot;
}
