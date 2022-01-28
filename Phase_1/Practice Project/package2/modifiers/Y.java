package package2.modifiers;

import package1.modifiers.M;
import package1.modifiers.N;

public class Y extends N{

	public static void main(String[] args) {
		
		M objM=new M();
		objM.publicmethod();
		
		X objX=new X();
		System.out.println("Variables of X "+objX.cc);
		System.out.println("Variables of X "+objX.m);
		System.out.println("Variables of X "+objX.l);
		
	}

}
