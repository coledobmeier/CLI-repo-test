public class StudentStatsArray 
{
    // Add private final variable to hold Students array
    private final Student[] students;

    public StudentStatsArray(Student[] students) 
    {
        this.students = students;
    }

    // Returns the average GPA of the students
    public double averageGpa() 
    {
        double totalGpa = 0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }
        return totalGpa / students.length;
    }

    // Returns the GPA range of the students
    public double getGpaRange() 
    {
        double minGpa = Double.MAX_VALUE;
        double maxGpa = Double.MIN_VALUE;
        for (Student student : students) {
            double gpa = student.getGpa();
            if (gpa < minGpa) minGpa = gpa;
            if (gpa > maxGpa) maxGpa = gpa;
        }
        return maxGpa - minGpa;
    }

    // Returns the name of the student that has the longest name
    public String getLongestName() 
    {
        String longestName = "";
        for (Student student : students) {
            if (student.getName().length() > longestName.length()) {
                longestName = student.getName();
            }
        }
        return longestName;
    }

    // Returns a count of the number of freshman students
    public int getNumFreshman() 
    {
        int count = 0;
        for (Student student : students) {
            if (student.getYear() == 1) {
                count++;
            }
        }
        return count;
    }

    // Returns the index of the first student with a name equal to name.
    // Returns -1 if not found
    public int search(String name) 
    {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Returns the index of the first student with a GPA greater than or equal to the given GPA
    // Returns -1 if not found
    public int search(double gpa) 
    {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGpa() >= gpa) {
                return i;
            }
        }
        return -1;
    }

    // Returns 1 if the students are sorted in ascending order by their GPA; -1 if in descending order; 0 otherwise
    public int sortStatus() 
    {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < students.length; i++) {
            if (students[i].getGpa() < students[i - 1].getGpa()) {
                ascending = false;
            }
            if (students[i].getGpa() > students[i - 1].getGpa()) {
                descending = false;
            }
        }

        if (ascending) return 1;
        if (descending) return -1;
        return 0;
    }

    // Returns the array of students in JSON-like format
   public String toString() 
    {
       String info = "[\n";
       for (int i = 0; i < students.length-1; i++) {
         info += students[i].toString();
         info += ",\n";
       }
       info += students[students.length - 1].toString();
       info += ",\n]";
       return info;
    }
}
