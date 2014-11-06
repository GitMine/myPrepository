package com.kk.encryption;

public class Distance {
//	39.9902920000,116.3181950000
	
	public static void main(String[] args) {
		double x1 = 39.9902920000;
		double y1 = 116.3181950000;
		double x2 = 0;
		double y2 = 0;
		double a = Math.abs(x2 - x1);
		double b = Math.abs(y2 - y1);
		double c = Math.sqrt(a *a + b * b);
		System.out.println("æ‡¿Î£∫" + c);
	}
}
