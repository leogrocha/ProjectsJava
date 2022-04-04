package Exercises;



public class Test {
    public static void main(String[] args) {
        String horario = "07:05:45 PM";

        String convertion = horario.substring(0,2);
        int result = (Integer.parseInt(convertion) + 12);
        String newHour = String.valueOf(result);
        System.out.println(horario.replace(horario.substring(0,2), newHour));
        
        
    }
}
