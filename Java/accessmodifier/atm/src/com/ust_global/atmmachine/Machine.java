package com.ust_global.atmmachine;

public class Machine {
	void slot(ATM a) {
		a.validateCard();
		a.getInfo();
	}
}
