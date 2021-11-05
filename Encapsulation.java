package com.chapter04;

public class Employee {

	  private String  firstName ;
    private String lastName ;
    private final int type ;
    
    
    public Employee() {
		this.type = 2;
    	
    }


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	
}
