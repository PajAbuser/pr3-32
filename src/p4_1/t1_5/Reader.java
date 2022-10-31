package p4_1.t1_5;

public class Reader {
    public String fio;
    public String number;
    public String faculty;
    public String date;
    public String phoneNum;

    public void takeBook(){}

    public void takeBook(int n){
        System.out.print("\n" + fio + " taked " + n + " books");
    }
    public void takeBook(String[] books){
        System.out.print("\n" + fio + " taked books: ");
        for(String s : books){
            System.out.print(s + " ");
        }
    }
    public void takeBook(Book[] books){
        System.out.print("\n" + fio + " taked books: ");
        for(Book book : books){
            System.out.print(book.getName() + " ");
        }
    }

    public void returnBook(){}

    public void returnBook(int n){
        System.out.print("\n" + fio + " returned " + n + " books");
    }
    public void returnBook(String[] books){
        System.out.print("\n" + fio + " returned books: ");
        for(String s : books){
            System.out.print(s + " ");
        }
    }
    public void returnBook(Book[] books){
        System.out.print("\n" + fio + " returned books: ");
        for(Book book : books){
            System.out.print(book.getName() + " ");
        }
    }
}
