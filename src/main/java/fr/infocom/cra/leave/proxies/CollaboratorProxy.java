package fr.infocom.cra.leave.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.infocom.cra.leave.models.Collaborator;

@FeignClient(name = "collaborator", url = "localhost:8900/collaborateurs")
public interface CollaboratorProxy {
	
	/**
	 * This Get method returns the list of all collaborators in your database
	 * 
	 * @return list<Collaborator>
	 * @see Collaborator()
	 */
	@GetMapping("/lister")
	List<Collaborator> listCollaborator();

	/**
	 * This Get method returns an existing collaborator in your database based on
	 * his unique identification
	 * 
	 * @param id representing a unique identification Collaborator
	 * @return Collaborator
	 * @see Collaborator()
	 */
	@GetMapping("/lister/{id}")
	Collaborator getOneCollaboratorById(@PathVariable("id") int id);
}