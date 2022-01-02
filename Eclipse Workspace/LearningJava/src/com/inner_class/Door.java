package com.inner_class;

public class Door {
	public boolean isLocked(String key) {
		class Lock {
			public boolean isLocked(String key) {
				if (key.equals("qwerty")) {
					return true;
				} else {
				return false;
				}
			}
		}
		return new Lock().isLocked(key);
	}
}
