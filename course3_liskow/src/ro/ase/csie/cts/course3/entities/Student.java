package ro.ase.csie.cts.course3.entities;

public class Student {

    boolean hasScholarship;
    boolean isEnrolled;
    int age;
    int enrollmentYear;

    void payTax(){};    //depends on Accounting
    void takeOOPExam(){};    //depends on prof
    void saveToDB(){};  //depends on DB admin

    void incrementAge(){
        if(this.age <20){
            this.age +=1;
        }else{
            this.age +=2;
        }

        // same thing:
        // this.age = (this.age < 20) ? (this.age +=1) : (this.age += 2);
    }

    String getInfo() {

        String message;

        //test for true
        if (this.hasScholarship) {
            return "The student has a scholarship";
        }else{
            return "No Scholarship";
        }
    }

    public int aSimpleFunction (){
        return 10;
    }
}
