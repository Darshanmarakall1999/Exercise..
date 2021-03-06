package mainUipack;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateComparison {
    public boolean dateCom(Date date)
    {
        LocalDate td= LocalDate.now();
        Date currentDate=Date.from(td.atStartOfDay(ZoneId.systemDefault()).toInstant());
        if(date.compareTo(currentDate)>0)
        {
            return true;
        }
        else if (date.compareTo(currentDate)<0)
        {
            return false;
        }
        else
        {
            return false;
        }
    }
}
