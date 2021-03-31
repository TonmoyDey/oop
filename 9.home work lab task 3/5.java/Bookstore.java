public class Bookstore {
    public String title,auther,id;
    public Bookstore(String id ){
        this.id = id;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }
    public String getTitle(){
        return title;
    }
    public void detailofthebook(){
        System.out.println("BOOK AUTHER ="+ this.auther);
        System.out.println("BOOK ID ="+this.id);
        System.out.println("BOOK TITTLE ="+this.title);
    }
}
