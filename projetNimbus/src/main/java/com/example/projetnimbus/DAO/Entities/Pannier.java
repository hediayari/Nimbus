package com.example.projetnimbus.DAO.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Pannier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int pannierId;
    String codePromo;
    @Temporal(TemporalType.DATE)
    Date dateCreation;
    int qtepan; 
}
