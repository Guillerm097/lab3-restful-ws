package rest.addressbook.domain;

import java.util.Objects;

/**
 * A phone number
 */
public class PhoneNumber {

  private String number;
  private PhoneType type = PhoneType.HOME;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneType getType() {
    return type;
  }

  public void setType(PhoneType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object other) {
    if(this == other) {
      return true;
    }
    else if(!(other instanceof PhoneNumber)) {
      return false;
    }
    else {
      PhoneNumber o = (PhoneNumber) other;
      return this.getNumber() == o.getNumber();
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type);
  }

}
