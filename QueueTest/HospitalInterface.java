package QueueTest;

import java.text.ParseException;

public interface HospitalInterface {

    void toScheduleQuery() throws ParseException;
    void toCancelQuery();
}
