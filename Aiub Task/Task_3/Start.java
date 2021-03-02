public class Start {
    public static void main(String[] args) {
        StoryBook b1 = new StoryBook();
        StoryBook b2 = new StoryBook("ISBN:12-23-14","Java","Havart",50.00,10,"Book");
        b2.showDetails();
        System.out.println("");
        TextBook t1 =new TextBook();
        TextBook t2 = new TextBook("ISBN:23-43-25","Java Basic","Joshua Bloch",50.00,10,20);
        t2.showDetails();


    }
}
