package com.utils;

import java.io.InputStream;
import java.util.Properties;

public final class PropertyReader {
	private static Properties properties = new Properties();

	static {

		try (InputStream input = PropertyReader.class.getClassLoader().getResourceAsStream("config.properties")) {
			if (input == null) {
				System.out.println("config.properties not found");
			}

			properties.load(input);
			input.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static String loadProperty(String propertyName) {
		String property = properties.getProperty(propertyName);
		System.out.println("Property " + property);
		return property;
	}
}
