package com.healthcare.healthcare.Entities;

import lombok.*;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "patient_records")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany(mappedBy = "patientRecord", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patientRecord", cascade = CascadeType.ALL)
    private List<PrescribedMedicine> prescribedMedicines;

    // other fields for patient record
}

