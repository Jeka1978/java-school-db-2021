package design_patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RadioAlarm implements Radio,Alarm {
    @Delegate
    private Alarm alarm = new AlarmImpl();

    @Delegate(excludes = RadioAlarmExclusions.class)
    private Radio radio = new RadioImpl();



}
