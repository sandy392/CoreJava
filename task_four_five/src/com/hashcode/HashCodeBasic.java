package com.hashcode;

public class HashCodeBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String name1 = "Sandy";
		        String name2 = "Shri";
		        String name3 = "Sandy";
		        System.out.println("name1.equals(name2): "+name1.equals(name2));
		        System.out.println("name1.hashCode() = "+name1.hashCode());
		        System.out.println("name2.hashCode() = "+name2.hashCode());
		
		        System.out.println("name1.equals(name3): "+name1.equals(name3));
		        System.out.println("name1.hashCode() = "+name1.hashCode());
		        System.out.println("name3.hashCode() = "+name3.hashCode()); 

	}

}
