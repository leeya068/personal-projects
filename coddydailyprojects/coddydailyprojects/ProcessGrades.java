package coddydailyprojects;

/*
Create a student grade tracker that uses jagged arrays to store grades for different subjects, 
where each student might take a different number of subjects. 
Create a method that builds and processes such a grade system.

Create a method processGrades that takes two parameters:
- numStudents - number of students
- subjectsPerStudent - array containing how many subjects each student takes

Returns a jagged array where:
- Each row represents a student
- Each row length matches the number of subjects that student takes
- Fill each element with a grade calculated using this formula: (studentIndex + 1) × 10 + (subjectIndex + 1)


Formula explanation:

studentIndex: the array row index (0, 1, 2, ...)
subjectIndex: the column index within that row (0, 1, 2, ...)

Example:
Student 0, Subject 0: (0 + 1) × 10 + (0 + 1) = 11
Student 0, Subject 1: (0 + 1) × 10 + (1 + 1) = 12
Student 1, Subject 0: (1 + 1) × 10 + (0 + 1) = 21

*/


class ProcessGrades {
    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {
        if (numStudents == 0 || subjectsPerStudent.length == 0) {
            return new int[0][];
        }
        
        int[][] grades = new int[numStudents][];
        
        for (int i = 0; i < numStudents; i++) {
            grades[i] = new int[subjectsPerStudent[i]];
            for (int j = 0; j < subjectsPerStudent[i]; j++) {
                grades[i][j] = (i + 1) * 10 + (j + 1);
            }
        }
        
        return grades;
    }
}