public class Library {
    private String libName;
    private String libAddress;
    private AddressBook[] listOfBook;
    int totalBook;
    // public constructors
    public Library() {
    }
    // parameterised constructor
    public Library(String libName, String libAddress, AddressBook[] listOfBook, int totalBook) {
        this.libName = libName;
        this.libAddress = libAddress;
        this.listOfBook = listOfBook;
        this.totalBook = totalBook;
    }
    //getters and setters
    public String getLibName() {
        return libName;
    }
    public void setLibName(String libName) {
        this.libName = libName;
    }
    public String getLibAddress() {
        return libAddress;
    }
    public void setLibAddress(String libAddress) {
        this.libAddress = libAddress;
    }
    public AddressBook[] getListOfBook() {
        return listOfBook;
    }
    public void setListOfBook(AddressBook[] listOfBook) {
        this.listOfBook = listOfBook;
    }
    public int getTotalBook() {
        return totalBook;
    }
    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }
    // methods
    public void ShowLinInfo()
    {
        // print the library information here
    }
    public void AddNewBook(AddressBook book)
    {
        // add the book
    }
    public void DeleteBook(AddressBook book)
    {
        // delete the book here
    }
    public void addNewBookCopy(AddressBook book, int copy)
    {
        // add the new book copy here
    }
}