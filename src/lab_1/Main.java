package lab_1;

public class Main {
    public static void main (String[] args) {
        Monitor firstMonitor = new Monitor("gray", 40.5f, 5.5f, "HD");
        System.out.println(firstMonitor.accessMonitorProperties());
        Monitor secondMonitor = new Monitor("black", 60.5f, 6.5f, "HD");
        System.out.println(secondMonitor.accessMonitorProperties());
        if (firstMonitor != secondMonitor) {
            System.out.println("The monitors are not the same");
        } else {
            System.out.println("The monitors have the same characteristics");
        }

        Student firstStudent = new Student("John", 19, 7.9f);
        Student secondStudent = new Student("Alex", 20, 8.3f);
        Student thirdStudent = new Student("Helen", 20, 9.5f);
        Student fourthStudent = new Student("Andrew", 21, 6.9f);
        Student fifthStudent = new Student("Mary", 20, 7.8f);
        Student sixthStudent = new Student("Holly", 19, 8.4f);
        Student seventhStudent = new Student("Drag", 21, 9.1f);
        Student eigthStudent = new Student("Lolly", 20, 6.7f);
        Student ninethStudent = new Student("Chris", 19, 8.2f);

        University firstUniversity = new University("TUM", 1964);
        University secondUniversity = new University("SUM", 1946);
        University thirdUniversity = new University("UESM", 1992);

        firstUniversity.students[0] = firstStudent;
        firstUniversity.students[1] = secondStudent;
        firstUniversity.students[2] = thirdStudent;
        secondUniversity.students[0] = fourthStudent;
        secondUniversity.students[1] = fifthStudent;
        secondUniversity.students[2] = sixthStudent;
        thirdUniversity.students[0] = seventhStudent;
        thirdUniversity.students[1] = eigthStudent;
        thirdUniversity.students[2] = ninethStudent;

        float averageMediaTUM;
        averageMediaTUM = firstUniversity.getAverageMedia();
        float averageMediaSUM;
        averageMediaSUM = secondUniversity.getAverageMedia();
        float averageMediaUESM;
        averageMediaUESM = thirdUniversity.getAverageMedia();

        System.out.println("Average Media per universities is TUM: " + averageMediaTUM + "\nSUM: " + averageMediaSUM +
                "\nUESM: " + averageMediaUESM);
    }
}