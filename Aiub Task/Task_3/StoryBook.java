public class StoryBook {
      private String isbn ;
      private String bookTitle;
      private String authorName;
      private String category;
      private double price;
      private  int availableQuantity;
      private static double discountRate;



    //Default constructor
    StoryBook()
    {
       
    }

    // parameterized constructor
    StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
    {
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.authorName=authorName;
        this.price=price;
        this.availableQuantity=availableQuantity;
        this.category=category;


    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public static void setDiscountRate(double discountRate) {
        StoryBook.discountRate = discountRate;
    }
    public static double getDiscountRate() {
        return discountRate;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }


    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookTitle() {
        return bookTitle;
    }


    public void addQuantity(int amount)
    {
        if(amount>0)
        {
            availableQuantity = availableQuantity + amount;
            System.out.println("Done");
        }
        else
        {
            System.out.println("Invalid Request");
        }
    }


    public void sellQuantity(int amount)
    {
        if(amount>0 && amount<=availableQuantity)
        {
            availableQuantity = availableQuantity - amount;
            System.out.println("Done");
        }
        else
        {
            System.out.println("Invalid Request");
        }
    }

    void showDetails(){
        System.out.println("ISBN: "+isbn);
        System.out.println("BookTitle: "+bookTitle);
        System.out.println("AuthorName: "+authorName);
        System.out.println("Price: "+price);
        System.out.println("AvailableQuantity: "+availableQuantity);
        System.out.println("Category :"+category);
        System.out.println("DiscountRate :"+discountRate+"%");
        





    }











}

