package sg.edu.rp.c346.p02_holidays;

public class Holidays {
    private String name;
    private String date;
    private boolean image;

    private String type;

    public Holidays(String name, String date, boolean image, String type){
        this.name = name;
        this.date = date;
        this. image = image;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
