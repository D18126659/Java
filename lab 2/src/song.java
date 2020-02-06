/*****************************************
 * Control: To run a class called songs
 * Author: Sultan Alghamdi
 * Date: 5th February 2020
 */
public class song {
    String song;
    String artist;
    boolean PlayedRecently;

    //Constructor
    public song(String songName, String artistName, Boolean Played) {
        this.song = songName;
        this.artist = artistName;
        PlayedRecently = Played;
    }

    public String getSongName() {
        return song;
    }
    public boolean getPlayedRecently(){
        return PlayedRecently;
    }
    public String getArtist() {
        return artist;
    }

    public void getSong(String newsong) {
        song = newsong;

    }

    public void SetArtist(String NewArtist) {
        if (NewArtist.contains(" ")) {
            artist = NewArtist;
        } else {
            System.out.println("You didn't send a valid name");
        }
    }

    public String toString()
    {
        return "Song name: "+ getSongName()+"\nArtist name: "+getArtist()+"\nPlayed Recently?: "+getPlayedRecently();
    }

    public static void main(String[] args) {
        {
            song song= new song("Let it go","Stromzy",Boolean.TRUE);
            System.out.println(song);
        }
    }
}
