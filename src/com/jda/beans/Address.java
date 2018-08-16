package com.jda.beans;

public class Address {
		private String city;
		private String state;
		private String country;

		public Address(String city, String state, String country) {
			this.city = city;
			this.state = state;
			this.country = country;

			System.out.println(this.getClass().getSimpleName() + " Created");
		}

		public String toString() {
			return  city + " " + state + " " + country;
		}
	}


