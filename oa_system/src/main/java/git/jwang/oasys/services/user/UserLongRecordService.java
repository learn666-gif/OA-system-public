package git.jwang.oasys.services.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import git.jwang.oasys.model.dao.user.UserLogRecordDao;
import git.jwang.oasys.model.entity.user.LoginRecord;

@Service
@Transactional
public class UserLongRecordService {
	@Autowired
	private UserLogRecordDao  ulDao;
	
	public LoginRecord save(LoginRecord lr){
		return ulDao.save(lr);
	}
	
}
