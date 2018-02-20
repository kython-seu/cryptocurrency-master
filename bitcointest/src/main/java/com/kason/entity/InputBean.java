package com.kason.entity;

public class InputBean {

	public String prevOutHash;

	public long prevOutIndex;

	public String sigScript;

	public InputBean(OutputEntity output) {
		this.prevOutHash = output.txoutHash;
		this.prevOutIndex = output.txoutIndex;
		this.sigScript = output.sigScript;
	}

}
