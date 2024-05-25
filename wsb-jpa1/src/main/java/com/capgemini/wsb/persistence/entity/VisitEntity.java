package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	@ManyToOne
			(fetch = FetchType.LAZY) // Relacja dwukierunkowa, gdzie doktor zna swoje wizyty, a wizyty mają przypisanego doktora
	@JoinColumn
			(name = "DOCTOR_ID")
	private DoctorEntity doctorEntity;

	@ManyToOne
			(fetch = FetchType.LAZY) // Relacja dwukierunkowa, czyli pacjent wie kiedy ma wizytę, a wizyta zna pacjenta
	@JoinColumn
			(name = "PATIENT_ID")
	private PatientEntity patientEntity;

	@ManyToMany( // Relacja jednokierynkowa many to many, co daje nam połączenie wielu medicaltreatment do różych wizyt czyli mozemy mieć określone leczenie, które tylko przypisujemy do wizyt
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JoinTable(
			name = "MEDICALTREATMENTS_TO_VISITS",
			joinColumns = @JoinColumn(name = "MEDICAL_TREATMENT_ID"), inverseJoinColumns = @JoinColumn(name = "VISIT_ID")
	)
	private Collection<VisitEntity> visitEntities;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public DoctorEntity getDoctorEntity() {
		return doctorEntity;
	}

	public void setDoctorEntity(DoctorEntity doctorEntity) {
		this.doctorEntity = doctorEntity;
	}

	public Collection<VisitEntity> getVisitEntities() {
		return visitEntities;
	}

	public void setVisitEntities(Collection<VisitEntity> visitEntities) {
		this.visitEntities = visitEntities;
	}

	public PatientEntity getPatientEntity() {
		return patientEntity;
	}

	public void setPatientEntity(PatientEntity patientEntity) {
		this.patientEntity = patientEntity;
	}
}
