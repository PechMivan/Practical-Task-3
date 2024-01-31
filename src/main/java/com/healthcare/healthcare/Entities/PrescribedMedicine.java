package com.healthcare.healthcare.Entities;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "prescribed_medicines")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescribedMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "medicine_name")
    private String dose;

    @ManyToOne
    @JoinColumn(name = "patient_record_id")
    private PatientRecord patientRecord;

    // other fields for prescribed medicine
}

