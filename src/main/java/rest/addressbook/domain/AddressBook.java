package rest.addressbook.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A really simple Address Book. This class is not thread safe.
 */
public class AddressBook {

  private int nextId = 1;
  private List<Person> personList = new ArrayList<>();

  public AddressBook() {}

  public AddressBook(AddressBook ab) {
    this.nextId = ab.nextId;
    this.personList = new ArrayList<>(ab.personList);
  }

  /**
   * The value of next unique identifier.
   *
   * @return the next unique identifier.
   */
  public int getNextId() {
    return nextId;
  }

  public void setNextId(int nextId) {
    this.nextId = nextId;
  }

  /**
   * The list of persons in this address book.
   *
   * @return a person list.
   */
  public List<Person> getPersonList() {
    return personList;
  }

  public void setPersonList(List<Person> persons) {
    this.personList = persons;
  }

  /**
   * Returns the old next identifier and increases the new value in one.
   *
   * @return an identifier.
   */
  public int nextId() {
    int oldValue = nextId;
    nextId++;
    return oldValue;
  }

  @Override
  public boolean equals(Object other) {
    if(this == other) {
      return true;
    }
    else if(!(other instanceof AddressBook)) {
      return false;
    }
    else {
      AddressBook o = (AddressBook) other;
      return (this.nextId == o.nextId) && (this.getPersonList().equals(o.personList));
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextId, personList);
  }
}
