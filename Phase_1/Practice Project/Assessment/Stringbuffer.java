package Assessment;

public class Stringbuffer {

	public static void main(String[] args) {
		String a = "Pavan";
		StringBuffer buf = new StringBuffer(a);
		buf.append("_Jr");
		String result = buf.toString();
		System.out.println("String to Str.Buffer: "+result);
		String str="Pavan_Jr11";
		StringBuilder sbl = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder(str);
        System.out.println("StringBuilder contents: " + sbl+sb2);
	}

}
