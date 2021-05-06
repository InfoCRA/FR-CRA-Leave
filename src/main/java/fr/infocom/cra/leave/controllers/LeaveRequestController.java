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

import fr.infocom.cra.leave.exceptions.LeaveRequestNotFoundException;
import fr.infocom.cra.leave.managers.LeaveRequestManager;
import fr.infocom.cra.leave.models.LeaveRequest;

/**
 * @author ibenhsine
 *
 */

@RestController
@RequestMapping("/demandesdeconge")
public class LeaveRequestController {
	
	@Autowired
	private LeaveRequestManager leaveRequestManager;

	/**
	 * This Get method returns the list of all leave requests in your database
	 * 
	 * @return list<LeaveRequest> *
	 * @see LeaveRequest()
	 */
	@GetMapping("/lister")
	public List<LeaveRequest> listLeaveRequest() {
		return (List<LeaveRequest>) leaveRequestManager.findAll();
	}

	/**
	 * This Get method returns an existing leave request in your database based on
	 * his unique identification
	 * 
	 * @param id representing a unique identification of the leave request
	 * @return LeaveRequest
	 * @see LeaveRequest()
	 */
	@GetMapping("/lister/{id}")
	public Optional<LeaveRequest> getOneLeaveRequestById(@PathVariable int id) {

		Optional<LeaveRequest> leaveRequest = leaveRequestManager.findById(id);

//		Collaborator collaborator = collaboraterProxy.getOneCollaboratorById(leaveRequest.get().getCollaboraterId());
//		System.out.println(collaborator.toString());
		if (!leaveRequest.isPresent())
			throw new LeaveRequestNotFoundException(
					"La demande de congé correspondante à l'id " + id + " n'existe pas.");

		return leaveRequest;
	}

	/**
	 * This Post method allows you to update the list of all leave requests in
	 * your database by adding the leave request if it's new or update its
	 * informations in case it already exist in your database.
	 * 
	 * @param LeaveRequest
	 * @see LeaveRequest()
	 */
	@PostMapping("/ajouter")
	public void addLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
		leaveRequestManager.createOrUpdate(leaveRequest);
	}

	/**
	 * This delete method allows you to delete a given leave request from your
	 * database
	 * 
	 * @param LeaveRequest
	 * @see LeaveRequest()
	 */
	@DeleteMapping("/supprimer")
	public void deleteLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
		leaveRequestManager.delete(leaveRequest);
	}	
}