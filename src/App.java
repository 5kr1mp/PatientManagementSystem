import java.util.*;
import java.time.*;
import java.time.format.*;

public class App {
    /* [========================== V A R I A B L E S ==========================] */

    /**
     * Patients
     * 
     * {@code patients[n][0]} returns the name of the patient...
     * {@code patients[n][1]} returns the passwo   
     * 
     rd info of the patient...
     * {@code patients[n][2]} returns the category of the patient (faculty or student)
     */
    static String[][] patients = new String[0][3];

    /**
     * 
     * {@code appointments[n][0]} returns the date & time of the appointment in String format (MM-DD-YY HH:mm)...
     * {@code appointments[n][1]} returns the name of the patient who made the appointment...
     * {@code appointments[n][2]} returns a short text describing the purpose of the appointment...
     * {@code appointments[n][3]} returns the contact number of the patient;
     */
    static String[][] appointments = new String[0][4];

    /**
     * Medicines
     * 
     * {@code medicines[n][0]} returns the name of the medicine...
     * {@code medicines[n][1]} returns the stock of the medicine...
     */
    static String[][] medicines = new String[0][2];

    /**
     * Visits
     * 
     * {@code visits[][][]} the 1st bracket determines which patient, visits[0][][] is the same as the first patient in the patients list
     * {@code visits[][][]} the 2nd bracket determines which instance of visit, sorted by date, visits [0][0][] is the first visit of the first patient
     * 
     * {@code visits[x][y][0]} is the date and time of the visit (MM-DD-YYYY HH:mm)
     * {@code visits[x][y][1]} is the purpose of the visit
     * {@code visits[x][y][2]} is the diagnosis of the doctor
     * {@code visits[x][y][3]} is the list of prescripted medicines, each medicine is separated by space, ex: "Paracetamol Ibuprofen"
     * {@code visits[x][y][4]} is the amount of medicine issued, separated by a number. Each is associated with the prescripted medicine by "index" ex: "2 3"
     * in the example, 2 paracetamol and 3 ibuprofen were prescribed and issued to the patient.
     */
    static String[][][] visits = new String[0][0][5];

    /**
     * format LocalDateTime {@code dd-MM-yyyy HH:mm}
     */
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    /**
     * {@code Scanner} ra gud
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * Ma set after log in, 
     * 
     */
    static String[] currentPatient;
    static int currentPatientIndex;

    /* [========================== M E T H O D S ==========================] */

    // ======== Service Methods ========
    static String[][] getPatients(){

    }

    static String[][] getStudentPatients(){

    }

    static String[][] getFacultyPatients(){

    }

    static String[][] getVisits(){

    }

    static String[][] getVisitsOf(int index){

    }

    static String[][] getVisitsByDate(String date){
        
    }

    static String[][] getAppointments(){
        return appointments;
    }

    static String[][] getAppointmentsToday(){

        LocalDateTime dateNow = LocalDateTime.now();

        for (String[] appointment : appointments) {

            LocalDateTime appointmentDate = LocalDateTime.parse(appointment[0],dateTimeFormatter);
            
        }
    }

    static String[][] getMedicines(){
        return medicines;
    }

    static String[] getMedicineByName(String name){
        for (String[] medicine : medicines) {
            if (medicine[0].equals(name)){
                return medicine;
            }
        }
        return null;
    }

    static void replenishMedicineStock(String[] medicine, int amountToReplenish){
        medicine[1] = Integer.toString(
            Integer.parseInt(medicine[1]) + amountToReplenish
        );
    }

    static void deductMedicineStock(String[] medicine, int amountToDeduct){
        medicine[1] = Integer.toString(
            Integer.parseInt(medicine[1]) - amountToDeduct
        );
    }

    static void updatePassword(String[] patient, String newPassword){

    }

    static void updateAdminPassword(String newPassword){

    }

    static void addPatient(String[] patient){

    }

    static void logVisit(String nameOfPatient, String[] visit){

    }

    static void addAppointment(String[] appointment){

    }

    // ==== Constructor / Builders ====

    /**
     * Creates a psuedo object of patient, and return it as a {@code String[]} array object
     * @param fullName The full name of the patient
     * @param password The password the patient uses to log in
     * @param category an {@code int} value that corresponds to the category of patient {@code 0} is patient, {@code 1} is faculty
     * @return a {@code String[]} array containing patient information
     */
    static String[] patientConstructor(String fullName, String password, int category){

        String categoryString = Integer.toString(category);
        String[] newPatient = {fullName,password, categoryString};

        return newPatient;
    }

    /**
     * Creates a psuedo object of medicine, and return it as a {@code String[]} array object
     * @param name The name of the medicine
     * @param initialStock The initial medicine stock
     * @return a {@code String[]} array containing information on a medicine
     */
    static String[] medicineConstructor(String name, int initialStock){

        String stockString = Integer.toString(initialStock);
        String[] newMedicine = {name,stockString};

        return newMedicine;
    }

    /**
     * Creates a psuedo object of appointment. {@return a {@code String[]} array which contains the appointment data}
     * 
     * 
     * @param dateTime The {@code LocalDateTime} of the appointment
     * @param name The name of the patient who set the appointment
     * @param purpose A short description of the purpose of the appointment
     * @param contactNumber A {@code String} of the contact number of the patient
     */
    static String[] appointmentConstructor(LocalDateTime dateTime, String name, String purpose, String contactNumber){
        
        // Different approach to convert LocalDateTime object into String:
        // String dateTimeString = String.format("%02d-%02d-%04d, %02d:%02d",dateTime.getMonthValue(),dateTime.getDayOfMonth(),dateTime.getYear(),dateTime.getHour(),dateTime.getMinute());

        // Format: MM-DD-YYYY, HH:mm
        String dateTimeString = dateTime.format(dateTimeFormatter);
        String[] newAppointment = {dateTimeString,name,purpose,contactNumber};

        return newAppointment;
    }

    /**
     * Creates a psuedo object of visit, and return it as a {@code String[]} array object
     * @param dateTime The {@code LocalDateTime} of the visit
     * @param purpose A short description of the purpose of the visit
     * @param diagnosis A short description of the diagnosis
     * @param prescriptions A {@code String[]} array/list of the names of the medicine issued
     * @param medicineIssuedAmount A {@code int[]} array/list of the amount of each medicine issued
     * @return a {@code String[]} array containing visit information
     */
    static String[] visitConstructor(LocalDateTime dateTime, String purpose, String diagnosis, String[] prescriptions, int[] medicineIssuedAmount){

        String dateTimeString = dateTime.format(dateTimeFormatter);

        // Combines all prescription from prescriptions[] into one String variable
        String prescriptionsString = "";
        for (String prescription : prescriptions) {
            prescriptionsString.concat(prescription+" ");
        }
        
        // Combines all medicine amount from medicineIssuedAmount[] into one String variable {1, 3, 4} becomes "1 3 4"
        String medicineIssuedAmountString = "";
        for  (int amount : medicineIssuedAmount){
            medicineIssuedAmountString.concat(amount+" ");
        }

        String[] newVisit = {dateTimeString, purpose, diagnosis, prescriptionsString, medicineIssuedAmountString};

        return newVisit;
    }

    // ==== Errors & Input Validation ====

    static void optionDoesNotExistError(){
        System.out.println("Option does not exist!");
        System.out.println("Press enter to continue...");
        sc.nextLine();
    }
    
    static void passwordInputError(){
        System.out.println("Incorrect password!");
        System.out.println("Press enter to continue...");
        sc.nextLine();
    }
    
    // ==== UI ====

    static void logIn(){
        // input full name and password
        
        // if fullName is "admin" && password is "USEPClinicAdmin_hk1iay3t", adtog admin menu
        // if fullName is "admin" pero mali ang password, passwordInputError()

        // if fullName does not exist sa list sa patients, then registerNewPatient()
        // if fullName exist and password is correct, then set th

    }

    static void exitProgram(){

        System.out.println("==== Patient Management System ====");
        System.out.println("Terminating program....");
        System.exit(0);

    }

    static void adminMenu(){
        int option;

        System.out.println("========== A D M I N ==========");
        System.out.println("[1] Appointments");
        System.out.println("[2] Inventory");
        System.out.println("[3] Patient Records");
        System.out.println("[4] Reports");
        System.out.println("[5] Exit\n");

        System.out.print("Enter option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                appointmentsMenu();
                break;
            case 2:
                inventoryMenu();
                break;
            case 3:
                patientRecordsMenu();
                break;
            case 4:
                reportsMenu();
                break;
            case 5:
                exitProgram();
                break;
            default:
                // When the option does not exist, mubalik sa admin menu
                optionDoesNotExistError();
                adminMenu();
                break;
        }
    }

    static void appointmentsMenu(){
        
    }

    static void inventoryMenu(){

    }

    static void patientRecordsMenu(){

    }

    static void reportsMenu(){

    }

    static void patientMenu(){

    }

    static void setAppointmentMenu(){

    }

    static void cancelAppointmentMenu(){

    }
    
    public static void main(String[] args) {
        System.out.println(patients[0][0]);
    }

}
