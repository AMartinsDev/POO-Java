package Lab6;

public class TestMusicStore {

    public static void main (String[] args){

        MusicStore x = new MusicStore();
        x.titles[0] = new MusicTitle();

        //x.setOpentime(10);
        //x.setClosetime(22);
        //x.setOwner("Arthur, propietário");
        //x.displayHoursOfOperation();
        //x.getOpenClosedMessage();
        //System.out.println(x.toString());

        x.titles[0].setTitle("Arere");
        x.titles[0].setArtist("Arere");

        /*
        x.titles[1].setTitle("Arere");
        x.titles[1].setArtist("Arere");
        x.titles[2].setTitle("Arere");
        x.titles[2].setArtist("Arere");
        */

        x.displayMusicTitles();
    }
}