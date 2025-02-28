package chapter12;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args){

        Map<String , Integer> gradebook = TestResults.getOriginalGrades();
        Map<String , Integer> test2 = TestResults.getMakeUpGrades();

        for(var student : test2.entrySet()){
            Integer firstGrade = gradebook.get(student.getKey());
            Integer secondGrade = test2.get(student.getKey())
;
        if(secondGrade > firstGrade){
            gradebook.put(student.getKey(), secondGrade);
        }
        }
        /*
            The forEach is used here to demonstrate another approach to looping.
            However, in reality, I would have added a print statement inside of
            the loop above so that the program does not have to loop over this map
            for a second time. This would be a more efficient approach:
            System.out.println("Student: " + student.getKey() + ", Grade:" + gradeBook.get(student.getKey()));
        */
        System.out.println("Final Grades");
        gradebook.forEach(
                (k,v) -> System.out.println("Student: " +k+ " grades " + v));


    }
}
