import java.io.*;
import java.util.HashMap;

public class RomanNumeral {

	String a;
	String b;
	String c;
	int q, w = 0;

	HashMap<String, Integer> romanToArabic = new HashMap<>();
	HashMap<Integer, String> arabicToRoman = new HashMap<>();

	void znachenia() {
		romanToArabic.put("I", 1);
		romanToArabic.put("II", 2);
		romanToArabic.put("III", 3);
		romanToArabic.put("IV", 4);
		romanToArabic.put("V", 5);
		romanToArabic.put("VI", 6);
		romanToArabic.put("VII", 7);
		romanToArabic.put("VIII", 8);
		romanToArabic.put("IX", 9);
		romanToArabic.put("X", 10);
		romanToArabic.put("L", 50);
		romanToArabic.put("C", 100);

		arabicToRoman.put(1, "I");
		arabicToRoman.put(2, "II");
		arabicToRoman.put(3, "III");
		arabicToRoman.put(4, "IV");
		arabicToRoman.put(5, "V");
		arabicToRoman.put(6, "VI");
		arabicToRoman.put(7, "VII");
		arabicToRoman.put(8, "VIII");
		arabicToRoman.put(9, "IX");
		arabicToRoman.put(10, "X");
		arabicToRoman.put(50, "L");
		arabicToRoman.put(100, "C");
	}

	void inputNums() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите арифмитическое "
		+ "выражение: ");
		String[] data = reader.readLine().split(" ");
		a = data[0];
		b = data[1];
		c = data[2];
	}

	void inputRomanAritmeticExpression() {
		q = romanToArabic.get(a);
		w = romanToArabic.get(c);
	}

	void operation() {
		if (b.equals("+")) {
			int z = q + w;
			if (z <= 10) {
				String result = arabicToRoman.get(z);
				System.out.println(result);
			} else if (z > 10) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(10) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(10));
				}
			}

		} else if (b.equals("-")) {
			int z = q - w;

			if (z != 0) {
				String result = arabicToRoman.get(z);
				System.out.println(result);
			} else {
				System.out.println(z);
			}

		} else if (b.equals("*")) {
			int z = q * w;
			if (z <= 10) {
				String result = arabicToRoman.get(z);
				System.out.println(result);
			} else if (z > 10 & z < 20) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				System.out.println(arabicToRoman.get(10) + ostatok);
			} else if (z >= 20 & z < 30) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(10) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(10));
				}
			} else if (z >= 30 & z < 40) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(10) + arabicToRoman.get(10) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(10) + arabicToRoman.get(10));
				}
			} else if (z >= 40 & z < 50) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(50) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(50));
				}
			} else if (z >= 50 & z < 60) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(50) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(50));
				}
			} else if (z >= 60 & z < 70) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(50) + arabicToRoman.get(10) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(50) + arabicToRoman.get(10));
				}
			} else if (z >= 70 & z < 80) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(50) + arabicToRoman.get(10) + arabicToRoman.get(10) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(50) + arabicToRoman.get(10) + arabicToRoman.get(10));
				}
			} else if (z >= 80 & z < 90) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(50) + arabicToRoman.get(10) + arabicToRoman.get(10)
							+ arabicToRoman.get(10) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(50) + arabicToRoman.get(10) + arabicToRoman.get(10)
							+ arabicToRoman.get(10));
				}
			} else if (z >= 90 & z < 100) {
				int z1 = z % 10;
				String ostatok = arabicToRoman.get(z1);
				if (ostatok != null) {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(100) + ostatok);
				} else {
					System.out.println(arabicToRoman.get(10) + arabicToRoman.get(100));
				}
			} else if (z == 100) {
				System.out.println(arabicToRoman.get(100));
			}

		} else if (b.equals("/")) {
			int z = q / w;
			String result = arabicToRoman.get(z);
			System.out.println(result);
		} else {
			System.out.println("Введите корректный символ " 
		+ "арифметической операции");
		}

	}

}
