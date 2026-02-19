import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        String[] date_time = appointmentDateDescription.split(" ");
        String[] date = date_time[0].split("/");
        return LocalDateTime.of(LocalDate.of(
            Integer.parseInt(date[2]),
            Integer.parseInt(date[0]),
            Integer.parseInt(date[1])
        ),
            LocalTime.parse(date_time[1])
        );

    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return 0 < LocalDateTime.now().compareTo(appointmentDate);

    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12
        && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return "You have an appointment on " + appointmentDate.format(format) + ".";

/*String.format("You have an appointment on %s, %s %d, %d, at %s.",
        appointmentDate.getDayOfWeek().toString(),
        appointmentDate.getMonth().toString(),
        appointmentDate.getDayOfMonth(),
        appointmentDate.getYear(),
        appointmentDate.toLocalTime().format(format) 
    );
*/  
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(),9,15);
    }
}
