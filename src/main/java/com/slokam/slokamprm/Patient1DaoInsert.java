package com.slokam.slokamprm;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Patient1DaoInsert extends JpaRepository<Patient1, Long> {
	//medicine name == patient name disease name and doctor name 
	@Query("select p.name ,di.name,d.name from Medication1 me join me.mm1 m "
			+"join me.ccc c "
			+"join c.v1 v "
			+"join v.appoinmnt a "
			+"join v.d1 d "
			+"join a.p1 p "
			+"join c.dd1 di "
			+"where m.name=?1")
	List<Object[]> getPatientByMedicine(String medicineName);

	// inut disease name=number of patients
	
	/*@Query("select p.name from Complaints1 c "
			+"join c. di "
			+  "join c.v1 v "
			+"join v.appoinmnt a "
			+"join a.p1 p "
			+"where di.name= ?"
			
			)
			
	List<Object[]> getPatientByDisease(String diseaseName);

*/
	@Query("select p.name ,di.name,d.name from Medication1 me join me.mm1 m "
			+"join me.ccc c "
			+"join c.v1 v "
			+"join v.appoinmnt a "
			+"join v.d1 d "
			+"join a.p1 p "
			+"join c.dd1 di "
			+"where m.name=?1")
	List<Object[]> getPatientByDisease(String diseaseName);
}