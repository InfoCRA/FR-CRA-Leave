package fr.infocom.cra.leave.managers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.infocom.cra.leave.dao.LeaveTypeDAO;
import fr.infocom.cra.leave.models.LeaveType;

@Service
public class LeaveTypeManagerImpl implements LeaveTypeManager {

	@Autowired
	private LeaveTypeDAO leaveTypeDAO;
	
	@Override
	public Iterable<LeaveType> findAll() {
		return leaveTypeDAO.findAll();
	}

	@Override
	public Optional<LeaveType> findById(int id) {
		return leaveTypeDAO.findById(id);
	}

	@Override
	public LeaveType createOrUpdate(LeaveType leaveType) {
		return leaveTypeDAO.save(leaveType);
	}

	@Override
	public void delete(LeaveType leaveType) {
		leaveTypeDAO.delete(leaveType);
	}
}