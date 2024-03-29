package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Area1")
public class Customer {
//so its updated
  @Id
  private String id;
  public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

private String firstName;
  private String lastName;

  /*
  public Customer() {}

  public Customer(String id,String firstName, String lastName) {
	  this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
*/
  @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }

}