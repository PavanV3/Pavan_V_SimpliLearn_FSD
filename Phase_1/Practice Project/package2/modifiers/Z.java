package package2.modifiers;

import package1.modifiers.M;
import package1.modifiers.N;
import package1.modifiers.P;

public class Z extends M{

	public static void main(String[] args) {
		
		// Called public method from N to Z
		N objN=new N();
		objN.publicmethod();
		// Called public method from P to Z
		P objP=new P();
		objP.publicmethod();
		
		X objX=new X();
		System.out.print("Variables of X "+objX.l);
		System.out.print("Variables of X "+objX.m);
		System.out.print("Variables of X "+objX.cc);

	}

}
