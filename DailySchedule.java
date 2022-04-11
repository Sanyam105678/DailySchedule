package com.company;



public class DailySchedule {

    public static void main(String[] args) {
        //Assume this can have any value from 1 to 7:
        int dayOfWeek = 5;
        //TODO: declare a String variable called schedule.

        String schedule="";
        //TODO: write a switch statement that give schedule a different
        switch (dayOfWeek){
            case 1:
                schedule="Gym in the morning.";
                //System.out.println("Gym in the morning.");
                break;

            case 2:
                schedule = "Class after work.";
                break;

            case 3:
                schedule = "Meetings all day.";
                break;

            case 4:
                schedule = "Work from home.";
                break;

            case 5:
                schedule="Game night after work.";
                break;


            default:
                schedule="free!";
                break;


        }
        //value for each day of the week based on the dayOfWeek variable.
        //Don't forget to "break" after each case, and don't forget to
        //provide a default case!
        System.out.println(schedule);
    }
}

