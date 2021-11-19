package Student;

public class StudyBuddies {
    public static Student[] groupFinder() {
        Student[] studentArray = new Student[6];
        Student[] sampleArray = Student.values();
        for (int s = 0; s < studentArray.length; ++s) {
            studentArray[s] = sampleArray[(int) (Math.random() * sampleArray.length)];
        }
        return studentArray;
    }

    public static void groupAnalyzer(Student[] studentArray) {
        System.out.println("The following types of students are in your study group:");
        Student[] sampleArray = Student.values();
        int[] studentCounter = new int[sampleArray.length];
        for (Student sampleStudent : studentArray) {
            for (int studentType = 0; studentType < sampleArray.length; ++studentType) {
                if (sampleStudent.equals(sampleArray[studentType])) {
                    studentCounter[studentType] += 1;
                }
            }
        }
        for (int count = 0; count < sampleArray.length; ++count) {
            System.out.println(sampleArray[count] + " " + studentCounter[count]);
        }
    }

    public static void groupScores(Student[] group1, Student[] group2) {

        int group1count = 0;
        int group2count = 0;
        for (Student s1 : group1) {
            switch (s1) {
            case PROCRASTINATOR:
                group1count += 0;
                break;
            case CURVE_BREAKER:
                group1count += 1;
                break;
            case LATECOMER:
                group1count += 2;
                break;
            case DAYDREAMER:
                group1count += 3;
                break;
            case TROUBLEMAKER:
                group1count += 4;
                break;
            case QUIET_ACHIEVER:
                group1count += 5;
                break;
            default:
            }
        }
        for (Student s2 : group2) {
            switch (s2) {
            case PROCRASTINATOR:
                group2count += 0;
                break;
            case CURVE_BREAKER:
                group2count += 1;
                break;
            case LATECOMER:
                group2count += 2;
                break;
            case DAYDREAMER:
                group2count += 3;
                break;
            case TROUBLEMAKER:
                group2count += 4;
                break;
            case QUIET_ACHIEVER:
                group2count += 5;
                break;
            default:
            }
        }
        if (group1count > group2count) {
            System.out.println("The former is predicted to perform better than the latter.");
        } else if (group2count > group1count) {
            System.out.println("The latter is predicted to perform better than the former.");
        } else {
            System.out.println("The two groups are predicted to perform equally well.");
        }
    }

    public static void main(String[] args) {
        Student[] group1 = groupFinder();
        Student[] group2 = groupFinder();
        StudyBuddies.groupAnalyzer(group1);
        StudyBuddies.groupAnalyzer(group2);
        StudyBuddies.groupScores(group1, group2);
    }
}

