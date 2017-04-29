package br.com.ceppf.response;

import java.util.ArrayList;
import java.util.List;

public class UserListOut {

	private List<UserOut> userOuts = new ArrayList<>();

	public UserListOut() {
		super();
	}

	public UserListOut(List<UserOut> userOuts) {
		super();
		this.userOuts = userOuts;
	}

	public List<UserOut> getUserOuts() {
		return userOuts;
	}

	public void setUserOuts(List<UserOut> userOuts) {
		this.userOuts = userOuts;
	}

}
