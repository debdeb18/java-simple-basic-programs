public class Song {
    public String title, artist, country;
    public int year;

    public Song(){
        //default constructor
    }

    public Song(int year, String title, String artist, String country){
        this.artist = artist;
        this.title = title;
        this.country = country;
        this.year = year;
    }

    public void show() {
        System.out.println(title+" by "+artist+" from "+country+", "+year);
    }

    public static void main(String[] args) {
        Song mySong = new Song(2021, "Dynamite", "BTS", "Korea");
        mySong.show();
    }
}
