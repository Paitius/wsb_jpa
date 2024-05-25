insert into address (id, address_line1, address_line2, city, postal_code) values
(1, '123 Main St', 'Apt 4B', 'Springfield', '12345'),
(2, '456 Elm St', 'Suite 2', 'Shelbyville', '23456'),
(3, '789 Oak St', NULL, 'Ogdenville', '34567'),
(4, '101 Pine St', 'Floor 3', 'North Haverbrook', '45678'),
(5, '202 Maple St', 'Apt 1A', 'Springfield', '56789'),
(6, '303 Birch St', NULL, 'Capital City', '67890'),
(7, '404 Cedar St', 'Unit 5', 'Shelbyville', '78901'),
(8, '505 Walnut St', 'Suite 7B', 'Ogdenville', '89012'),
(9, '606 Chestnut St', NULL, 'North Haverbrook', '90123'),
(10, '707 Ash St', 'Apt 2C', 'Springfield', '11234'),
(11, '808 Beech St', 'Unit 8', 'Shelbyville', '22345'),
(12, '909 Hickory St', NULL, 'Ogdenville', '33456'),
(13, '111 Sycamore St', 'Floor 4', 'North Haverbrook', '44567'),
(14, '222 Poplar St', 'Suite 9', 'Springfield', '55678'),
(15, '333 Fir St', 'Apt 3D', 'Shelbyville', '66789'),
(16, '444 Spruce St', NULL, 'Ogdenville', '77890'),
(17, '555 Hemlock St', 'Unit 6', 'North Haverbrook', '88901'),
(18, '666 Redwood St', 'Apt 4E', 'Springfield', '99012'),
(19, '777 Cedar St', 'Suite 10', 'Shelbyville', '10123'),
(20, '888 Alder St', NULL, 'Ogdenville', '21234');


insert into medical_treatment (id, description, type) values
(1, 'Badanie USG brzucha', 'USG'),
(2, 'Badanie EKG', 'EKG'),
(3, 'RTG kolana prawego', 'RTG'),
(4, 'Badanie USG jamy brzusznej', 'USG'),
(5, 'RTG kończyny górnej prawej', 'RTG'),
(6, 'RTG miednicy', 'RTG'),
(7, 'USG brzucha', 'USG');

insert into doctor (id, doctor_Number, email, first_Name, last_Name, specialization, telephone_Number, address_id) values
(1, 'D001', 'jdoe@example.com', 'John', 'Doe', 'Cardiology', '555-1234', 1),
(2, 'D002', 'asmith@example.com', 'Alice', 'Smith', 'Neurology', '555-2345', 2),
(3, 'D003', 'bwilliams@example.com', 'Bob', 'Williams', 'Orthopedics', '555-3456', 3),
(4, 'D004', 'cjones@example.com', 'Carol', 'Jones', 'Dermatology', '555-4567', 4),
(5, 'D005', 'djohnson@example.com', 'David', 'Johnson', 'Pediatrics', '555-5678', 5),
(6, 'D006', 'eevans@example.com', 'Emma', 'Evans', 'Radiology', '555-6789', 6),
(7, 'D007', 'fflores@example.com', 'Frank', 'Flores', 'Ophthalmology', '555-7890', 7),
(8, 'D008', 'ggarcia@example.com', 'Grace', 'Garcia', 'Psychiatry', '555-8901', 8),
(9, 'D009', 'hharris@example.com', 'Henry', 'Harris', 'Gastroenterology', '555-9012', 9),
(10, 'D010', 'ijackson@example.com', 'Isabella', 'Jackson', 'Endocrinology', '555-1122', 10);


insert into patient (id, first_Name, last_Name, telephone_Number, email, patient_Number, weight, height, address_id) values
(1, 'John', 'Doe', '555-1234', 'johndoe@example.com', 'P001', 70, 175, 1),
(2, 'Jane', 'Smith', '555-2345', 'janesmith@example.com', 'P002', 65, 160, 2),
(3, 'Alice', 'Johnson', '555-3456', 'alicejohnson@example.com', 'P003', 68, 168, 3),
(4, 'Bob', 'Brown', '555-4567', 'bobbrown@example.com', 'P004', 75, 180, 4),
(5, 'Charlie', 'Davis', '555-5678', 'charliedavis@example.com', 'P005', 85, 175, 5),
(6, 'David', 'Miller', '555-6789', 'davidmiller@example.com', 'P006', 60, 165, 6),
(7, 'Emma', 'Wilson', '555-7890', 'emmawilson@example.com', 'P007', 55, 155, 7),
(8, 'Frank', 'Moore', '555-8901', 'frankmoore@example.com', 'P008', 90, 185, 8),
(9, 'Grace', 'Taylor', '555-9012', 'gracetaylor@example.com', 'P009', 70, 170, 9),
(10, 'Hank', 'Anderson', '555-1122', 'hankanderson@example.com', 'P010', 95, 190, 10),
(11, 'Ivy', 'Thomas', '555-2233', 'ivythomas@example.com', 'P011', 65, 165, 11),
(12, 'Jack', 'Jackson', '555-3344', 'jackjackson@example.com', 'P012', 80, 180, 12),
(13, 'Karen', 'White', '555-4455', 'karenwhite@example.com', 'P013', 58, 158, 13),
(14, 'Leo', 'Harris', '555-5566', 'leoharris@example.com', 'P014', 77, 177, 14),
(15, 'Megan', 'Martin', '555-6677', 'meganmartin@example.com', 'P015', 62, 162, 15),
(16, 'Nathan', 'Thompson', '555-7788', 'nathanthompson@example.com', 'P016', 88, 188, 16),
(17, 'Olivia', 'Garcia', '555-8899', 'oliviagarcia@example.com', 'P017', 70, 170, 17),
(18, 'Paul', 'Martinez', '555-9900', 'paulmartinez@example.com', 'P018', 85, 175, 18),
(19, 'Quinn', 'Robinson', '555-1010', 'quinnrobinson@example.com', 'P019', 68, 168, 19),
(20, 'Rachel', 'Clark', '555-2020', 'rachelclark@example.com', 'P020', 72, 172, 20);


insert into visit (id, description, time, doctor_id, patient_id) values
(1, 'Routine check-up', '2024-05-01 09:00:00', 1, 1),
(2, 'Follow-up visit', '2024-05-02 10:30:00', 2, 2),
(3, 'Consultation', '2024-05-03 11:00:00', 3, 3),
(4, 'Annual physical', '2024-05-04 13:00:00', 4, 4),
(5, 'Specialist referral', '2024-05-05 14:00:00', 5, 5),
(6, 'Lab results review', '2024-05-06 15:30:00', 6, 6),
(7, 'New patient visit', '2024-05-07 08:30:00', 7, 7),
(8, 'Immunization', '2024-05-08 09:30:00', 8, 8),
(9, 'Prescription renewal', '2024-05-09 10:00:00', 9, 9),
(10, 'Minor surgery follow-up', '2024-05-10 11:30:00', 10, 10),
(11, 'Emergency visit', '2024-05-11 12:00:00', 1, 11),
(12, 'Chronic condition management', '2024-05-12 14:30:00', 2, 12),
(13, 'Post-operative check', '2024-05-13 15:00:00', 3, 13),
(14, 'Physical therapy referral', '2024-05-14 16:00:00', 4, 14),
(15, 'Dermatology consult', '2024-05-15 08:00:00', 5, 15),
(16, 'Mental health check', '2024-05-16 09:00:00', 6, 16),
(17, 'Cardiology follow-up', '2024-05-17 10:00:00', 7, 17),
(18, 'Neurology consult', '2024-05-18 11:00:00', 8, 18),
(19, 'Gastroenterology check-up', '2024-05-19 13:00:00', 9, 19),
(20, 'Endocrinology visit', '2024-05-20 14:00:00', 10, 20);


insert into MEDICALTREATMENTS_TO_VISITS (MEDICAL_TREATMENT_ID, VISIT_ID) values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(1, 8),
(2, 9),
(3, 10),
(4, 11),
(5, 12),
(6, 13),
(7, 14),
(1, 15),
(2, 16),
(3, 17),
(4, 18),
(5, 19),
(6, 20);
