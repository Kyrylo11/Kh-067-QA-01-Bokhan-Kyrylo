public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray = new String[]{};

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void getStudentArray() {
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = studentArray[i];
        }
    }

    public UniversityGroup(String groupName, int startYear) {
        this.startYear = startYear;
        this.endYear = startYear + 5;
        this.groupName = groupName;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.startYear = startYear;
        this.studentArray = studentArray;
        this.endYear = startYear + 5;
        this.groupName = groupName;
    }

    public  void addStudent(String[] students) {
        int k = 0;
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] == (null) && k < students.length) {
                studentArray[i] = students[k];
                k++;
            }
        }
    }

    public void getGroupDescription(String[] studentArray) {
        groupName = getGroupName();
        startYear = getStartYear();
        endYear = getEndYear();
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = studentArray[i];
            System.out.printf("\nStudent:%s\nGroup:%s\nStart year of education:%d\nEnd year of education:%d"
                    ,studentArray[i], groupName, startYear, endYear);
        }
    }

    public static void main(String[] args){
        String[] studentArray = new String[9];
        String[] students = new String[]{"Bokhan Kyrylo", "Black Oleksey", "Solomatin Oleksendr", "Pobereznik Mykyta"};
        UniversityGroup group1 = new UniversityGroup("545A", 2018);
        group1.addStudent(students);
        group1.getGroupDescription(studentArray);
        UniversityGroup group2 = new UniversityGroup("545B", 2018, studentArray);
        group2.addStudent(students);
        group2.getGroupDescription(studentArray);
        group2.getStudentArray();
    }
}
