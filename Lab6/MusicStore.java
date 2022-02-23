

import java.util.Calendar;
import java.util.Scanner;

public class MusicStore {

    MusicTitle[] titles;
    public String owner;
    public int opentime = 9;
    public int closetime = 21;

    public MusicStore() {
        this.owner = "Sem dono";
        this.titles = null;
    }


    public void displayHoursOfOperation() {
        System.out.println("Período:");
        Scanner scanner = new Scanner(System.in);
        this.opentime = scanner.nextInt();
        this.closetime = scanner.nextInt();
        //System.out.println("Diariamente das: " + this.getOpentime() + " as " +getClosetime());
        System.out.println("Dono: " + this.owner);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /*
    public int getOpentime() {
        return opentime;
    }

    public void setOpentime(int opentime) {
        this.opentime = opentime;
    }

    public int getClosetime() {
        return closetime;
    }

    public void setClosetime(int closetime) {
        this.closetime = closetime;
    }
    */

    public boolean isOpen() {
        boolean valor = false;
        if ((this.getHourInt() >= this.opentime) && (getHourInt() < this.closetime)) {
            valor = true;
        }
        return valor;
    }

    public int getHourInt() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.HOUR_OF_DAY);
    }

    public void getOpenClosedMessage() {
        if (this.isOpen()) {
            System.out.println("Estamos abertos");
        } else {
            System.out.println("Estamos fechados");
        }
    }

    public String toString() {
        return "Abre: " + this.opentime + " Fecha: " + this.closetime;
    }

    public MusicTitle[] getTitles() {
        return titles;
    }

    public void setTitles(MusicTitle[] titles) {
        this.titles = titles;
    }

    public void displayMusicTitles() {
        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
        }
    }
}