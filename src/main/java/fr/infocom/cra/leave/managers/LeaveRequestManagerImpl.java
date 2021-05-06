package fr.infocom.cra.leave.managers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.infocom.cra.leave.dao.LeaveRequestDAO;
import fr.infocom.cra.leave.models.LeaveRequest;

@Service
public class LeaveRequestManagerImpl implements LeaveRequestManager {

	@Autowired
	private LeaveRequestDAO leaveRequestDAO;
	
	@Override
	public Iterable<LeaveRequest> findAll() {
		return leaveRequestDAO.findAll();
	}

	@Override
	public Optional<LeaveRequest> findById(int id) {
		return leaveRequestDAO.findById(id);
	}

	@Override
	public LeaveRequest createOrUpdate(LeaveRequest leaveRequest) {
		return leaveRequestDAO.save(leaveRequest);
	}

	@Override
	public void delete(LeaveRequest leaveRequest) {
		leaveRequestDAO.delete(leaveRequest);
	}
}