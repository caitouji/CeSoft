package info.caitou.domain.entity.account;

import org.springframework.stereotype.Component;

@Component
public class AccountBase {
	private String code;
	private String codeName;
	private String alias;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "AccountBase [code=" + code + ", codeName=" + codeName + ", alias=" + alias + "]";
	}

}
