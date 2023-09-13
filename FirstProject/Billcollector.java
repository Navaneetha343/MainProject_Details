package com.example1.FirstProject;

public class Billcollector {
private Payment p;

public Payment getP() {
	return p;
}

public void setP(Payment p) {
	this.p = p;
}


public void bill() {
     String pay= p.pay();
     System.out.println(pay);
	}

}
