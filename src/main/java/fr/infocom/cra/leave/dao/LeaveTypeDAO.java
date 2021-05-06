package fr.infocom.cra.leave.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.infocom.cra.leave.models.LeaveType;

@Repository
public interface LeaveTypeDAO extends CrudRepository<LeaveType, Integer> {

}