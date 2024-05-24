class Book {
    int g;
    int l;

    public Book(int g, int l) {
        this.g = g;
        this.l = l;
    }

    @Override
    public String toString() {
        return "Book{" +
                "g=" + g +
                ", l=" + l +
                '}';
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}

public class Books{
    public static void main(String[] args) {

        Book obj=new Book(1,2);
        System.out.println(obj);
    }

}