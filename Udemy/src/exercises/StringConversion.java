package exercises;

public class StringConversion {
	public static void main(String[] args) {

		// int, double, float to String
		int i = 100;
		double d = 10.0;
		float f = 20.0f;

		// String st = String.valueOf(i);
		String si = Integer.toString(i);
		String sd = Double.toString(d);
		String sf = Float.toString(f);
		System.out.println(si + sd + sf);

		// String to int, double, float
		String str1 = "100";
		String str2 = "10.0";
		String str3 = "20.0";

		int istr = Integer.parseInt(str1);
		double dstr = Double.parseDouble(str2);
		float fstr = Float.parseFloat(str3);

		System.out.println(istr + dstr + fstr);
	}

}
