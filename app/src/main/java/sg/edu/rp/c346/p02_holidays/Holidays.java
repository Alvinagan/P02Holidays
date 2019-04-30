package sg.edu.rp.c346.p02_holidays;

public class Holidays {
    private String name;
    private String date;
    private boolean image;

    public Holidays(String name, String date, boolean image){
        this.name = name;
        this.date = date;
        this. image = image;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public boolean isImage(){
        return image;
    }
}
