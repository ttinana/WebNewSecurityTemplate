/**
 * 
 */
package rs.tijanap.model;

/**
 * @author ttinana
 *
 */
public class User {
	private String firstname;
	private String lastname;
	private long telNumber;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public long getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(long telNumber) {
		this.telNumber = telNumber;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
