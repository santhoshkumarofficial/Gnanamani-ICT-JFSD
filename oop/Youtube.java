package oop;

public class Youtube {
    private String email;
    private String[] playlist;
    public Youtube(){
        email = "";
        playlist = new String[10];
    }
    public Youtube(int size){
        email = "";
        playlist = new String[size];
    }
    public Youtube(String[] items){
        email = "";
        playlist = items;
    }
    public Youtube(String email, String[] items){
        this.email = email;
        playlist = items;
    }
    public void viewList(){
        for(String each:playlist){
            System.out.println(each);
        }
    }
}
class OpenAccount{
    public static void main(String[] args) {
        // Class object = dynmaic m/y constructor()
        Youtube mahesh = new Youtube();
        mahesh.viewList();
        Youtube vignesh = new Youtube(2);
        Youtube vikas = new Youtube(new String[]{"food","tech","games"});
        vikas.viewList();
        Youtube Madhesh = new Youtube("madhesh@gmail.com",new String[]{"games","songs","vlogs"});
        Madhesh.viewList();
        // mahesh.email = "mahesh@gmail.com";
    }
}
