public class AddressBook {
    // declare the properties as private
    private String ownerName;
    private String info;
    private Contact[] listOfContact;
    // constructors
    public AddressBook() {
    }
    // parameterised constructor
    public AddressBook(String ownerName, String info, Contact[] listOfContact) {
        this.ownerName = ownerName;
        this.info = info;
        this.listOfContact = listOfContact;
    }
    // public getters and setters
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public Contact[] getListOfContact() {
        return listOfContact;
    }
    public void setListOfContact(Contact[] listOfContact) {
        this.listOfContact = listOfContact;
    }
    
    public void ShowAllContactInfo()
    {
    //display all the contact information here
    }
    public void AddContact(Contact contact)
    {
    // add a contact to the list here
    }
    public void DeleteContact(Contact contact)
    {
    // Delete the contact from the list here
    }
}