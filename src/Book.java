public class Book {
    private String title;
    private Chapter chap;
    private double[] sec;
    public Book(Book other){
        double[] newArray = new double[other.sec.length];
        for(int i = 0; i < newArray.length; ++i){
            newArray[i] = other.sec[i];
        }
        this.sec = newArray;
        this.chap = new Chapter(other.chap);
        this.title = other.title;

    }

    public class Chapter{
        public Chapter(){

        }
        public Chapter(Chapter copy){

        }
    }
}
