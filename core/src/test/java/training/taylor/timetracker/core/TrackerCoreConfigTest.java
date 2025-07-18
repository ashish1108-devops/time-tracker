package training.taylor.timetracker.core;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerCoreConfigTest {

    @Autowired
    @Qualifier("timesheet")
    List<TimeEntry> entries;

    @Test
    public void testMe() {
        assertNotNull(entries);
    }
}
