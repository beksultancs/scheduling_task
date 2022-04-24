package peaksoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Beksultan
 */
@Component
public class ScheduledTask {

    public static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    public static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 10000)
    public void reportCurrenTime() {
        log.info("The time is now {}", dateTimeFormat.format(new Date()));
    }
}
