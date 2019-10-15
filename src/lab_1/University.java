package lab_1;

class University {
    private String name;
    private int foundationYear;
    public Student[] students = new Student[3];
    University(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }
    public float getAverageMedia() {
        int n = 3;
        int a[] = new int[n];
        float result = 0;
        for (int i = 0; i < n; i++) {
            result += students[i].mark;
        }

        return result/n;
    }
}
