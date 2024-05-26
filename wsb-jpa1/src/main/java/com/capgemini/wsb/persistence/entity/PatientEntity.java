package com.capgemini.wsb.persistence.entity;


import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String telephoneNumber;

	private String email;

	@Column(nullable = false)
	private String patientNumber;

	@Column(nullable = false)
	private int height;

	@Column(nullable = false)
	private int weight;


	@ManyToOne(fetch = FetchType.LAZY) // Relacja jednokierunkowa z Patient do Address, ponieważ adres nie musi znać informacji o pacjentach
	@JoinColumn(name = "ADDRESS_ID")
	private AddressEntity addressEntity;

	@OneToMany(mappedBy = "patientEntity", cascade = CascadeType.ALL) // Relacja dwukierunkowa, gdzie pacjent zna swoje wizyty, a wizyty mają przypisanego pacjenta.
	private Collection<VisitEntity> visitEntities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public Collection<VisitEntity> getVisitEntities() {
		return visitEntities;
	}

	public void setVisitEntities(Collection<VisitEntity> visitEntities) {
		this.visitEntities = visitEntities;
	}
}