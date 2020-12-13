package com.king;

import static java.lang.System.out;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
	public static int gcd(int m, int n) {
		if( n == 0 )
			return m;
		else
			return gcd(n, m%n);
	}

	public static void main(String... args) {
		out.println("This is main application");
		out.println("------------------------");
		out.println("Working going on...");

		try {
			InputStream is = App.class.getResourceAsStream("/application.properties");
			Properties props = new Properties();
			props.load(is);
			out.println( props.getProperty("name"));
			out.println( props.getProperty("country"));
		} catch (IOException exp){
			exp.printStackTrace();
		}

		for(int i=0;i<5; i++)
			out.println("hello, laksys!");



		out.println("done.....");
	}
}
