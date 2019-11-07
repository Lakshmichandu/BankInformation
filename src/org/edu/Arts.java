package org.edu;

public class Arts extends Education{
public void bSc() {
	System.out.println("Bsc is a UG course");

}
public void bEd() {
	System.out.println("BEd is a PG course");

}
public void bA() {
	System.out.println("bA is a UG course");

}
public void bBA() {
	System.out.println("BBA is a PG course");
}
@Override
	public void ug() {
	System.out.println("Bsc & BA are Under graduation course");
	}
@Override
	public void pg() {
	System.out.println("BEd & BBA are Post graduation course");
	}
public static void main(String[] args) {
	Arts a = new Arts();
	a.bA();
	a.bBA();
	a.bEd();
	a.bSc();
	a.pg();
	a.ug();
}
}
 