package info.caitou.dao.account;

import java.util.Map;
import java.util.TreeMap;

import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import info.caitou.domain.entity.account.AccountBase;

@Repository
public interface AccountBaseDao {

	@MapKey("code")
	public Map<String, AccountBase> getAccountBasesToMap();
	
}
