package Pack;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
        private Day day;
        private List<String> activities;

        public DaySchedule(Day day) {
            this.day = day;
            this.activities = new ArrayList<>();
        }
    public static void main(String[] args) {
        DaySchedule mondaySchedule = new DaySchedule(Day.MONDAY);
        DaySchedule tuesdaySchedule = new DaySchedule(Day.TUESDAY);

        mondaySchedule.addActivity("Mic dejun");
        mondaySchedule.addActivity("Alergare");
        mondaySchedule.addActivity("Fotbal");
        tuesdaySchedule.addActivity("Citit");
        for (String activity : mondaySchedule.getActivities()) {
            System.out.println(activity);
        }
        for(String activity:tuesdaySchedule.getActivities()){
            System.out.println(activity);
        }

    }

        public void addActivity(String activity) {
            activities.add(activity);
        }

        public List<String> getActivities() {
            return activities;
        }

    }


