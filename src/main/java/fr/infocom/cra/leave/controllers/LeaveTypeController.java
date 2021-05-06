package fr.infocom.cra.leave.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.infocom.cra.leave.managers.LeaveTypeManager;
import fr.infocom.cra.leave.models.LeaveType;

@RestController
@RequestMapping("/typesdeconge")
public class LeaveTypeController {
	@Autowired
	private LeaveTypeManager leaveTypeManager;
	
	/**
	 * This Get method returns the list of all leave types in your database
	 * 
	 * @return list<LeaveType>
	 * @see LeaveType()
	 */
	@GetMapping("/lister")
	public List<LeaveType> listLeaveType() {
		return (List<LeaveType>) leaveTypeManager.findAll();
	}

	/**
	 * This Get method returns an existing leave type in your database based on
	 * his unique identification
	 * 
	 * @param id representing a unique identification for the leave type
	 * @return LeaveType
	 * @see LeaveType()
	 */
	@GetMapping("/lister/{id}")
	public Optional<LeaveType> getOneLeaveTypeById(@PathVariable int id) {
		Optional<LeaveType> leaveType = leaveTypeManager.findById(id);
		return leaveType;
	}

	/**
	 * This Post method allows you to update the list of all leave types in your
	 * database by adding the leave type if's is new or update its informations in
	 * case it already exist in your database.
	 * 
	 * @param LeaveType
	 * @see LeaveType()
	 */
	@PostMapping("/ajouter")
	public void addLeaveType(@RequestBody LeaveType leaveType) {
		leaveTypeManager.createOrUpdate(leaveType);
	}

	/**
	 * This delete method allows you to delete a given leave type from your
	 * database
	 * 
	 * @param LeaveType
	 * @see LeaveType()
	 */
	@DeleteMapping("/supprimer")
	public void deleteLeaveType(@RequestBody LeaveType leaveType) {
		leaveTypeManager.delete(leaveType);
	}

}