package com.redhat.qe.auto.bugzilla;



public class VerifiesBzBug extends BzBugDependency {

	public VerifiesBzBug(String bugId) {
		this(new String[] {bugId});
	}

	
	public VerifiesBzBug(String[] bugIds) {
		super();
		this.bugIds = bugIds;
		this.type = Type.Verifies; 
	}
}
