import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class OldApp {
    
    /* [========================== V A R I A B L E S ==========================] */

    // Patients
    static ArrayList<String> patients = new ArrayList<String>();
    static ArrayList<String> studentPatients = new ArrayList<String>();
    static ArrayList<String> facultyPatients = new ArrayList<String>();

    // Appointments
    static ArrayList<String[]> appointments = new ArrayList<String[]>();

    // Visits
    static ArrayList<ArrayList<String[]>> visits = new ArrayList<ArrayList<String[]>>();

    // Medicines
    static ArrayList<String[]> medicines = new ArrayList<String[]>();

    // Passwords
    static ArrayList<String> passwords = new ArrayList<String>();

    // Formatter
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // Runtime variables
    // variables that will change during runtime
    static int currentUserIndex;

    /* [========================== M E T H O D S ==========================] */

    // ==== Service Methods ====
    static ArrayList<String> getPatients() {
        return patients;
    }

    static ArrayList<String> getStudentPatients(){
        return studentPatients;
    }

    static ArrayList<String> getFacultyPatients(){
    static ArrayList<String[]> getMedicines(){
        return medicines;
    }

        return facultyPatients;
    }

    static ArrayList<String[]> getVisits(){
        // will compile all visits into one list (becomes a 2d array instead of a 3d array)
    }

    static ArrayList<String[]> getVisitsByDate(LocalDate date){
        ArrayList<String[]> visits = getVisits();
        ArrayList<String[]> visitsByDate = new ArrayList<>();

        // for each 'visit' in 'visits', add 'visit' to 'visitsByDate' if the date of 'visit' is equal to 'date'

        return visitsByDate;
    }

    static ArrayList<String[]> getVisitsOf(int index){
        return visits.get(0);
    }

    static ArrayList<String[]> getAppointmentsByDate(LocalDate date){
        ArrayList<String[]> appointmentsToday = new ArrayList<>();

        // iterate each appointment in 'appointments', and add to 'appointmentsToday' if the date is equal to 'dateNow'

        return appointmentsToday;
    }

    static ArrayList<String[]> getAppointmentsToday(){
        LocalDate dateNow = LocalDate.now();
        ArrayList<String[]> appointmentsToday = new ArrayList<>();

        // iterate each appointment in 'appointments', and add to 'appointmentsToday' if the date is equal to 'dateNow'

        return appointmentsToday;
    }

    static void replenishMedicineStock(int indexOfMedicine, int amountToReplenish){

    }
    
    static void subtractMedicineStock(int indexOfMedicine, int amountToSubtract){

    }

    static void updatePassword(int indexOfUser, String newPassword){

    }

    static void addPatient(String name, String password, int category){
        // category = 0 if student, 1 if faculty
    }

    static void logVisit(LocalDateTime dateTime, String purpose, String diagnosis, String[] prescriptions, int[] medicineAmount){

    }

    static void addAppointment(LocalDateTime dateTime, String name, String purpose){

    }
    
    // ==== Input Validation & Data processing methods ====

    // ==== System Flow / UI / UX ====

    public static void main(String[] args) throws Exception {
        
    }
}
