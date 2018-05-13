package Refleksja.Zadania;

import java.util.Date;

public class EMail extends Document {
    private String subject;
    private String []to;

    public EMail(String[] to, String subject, Date date) {
        super(date);
        this.to=to;
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }
    public String[] getTo() {
        return to;
    }


}
