package weekOne;

/** Task
 Write a Person class with an instance variable, age, and a constructor that
 takes an integer, initialAge, as a parameter. The constructor must assign initialAge to age
 after confirming the argument passed as  is not negative; if a negative argument is
 passed as , the constructor should set  to  and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

 yearPasses() should increase the  instance variable by 1.
 amIOld() should perform the following conditional actions:
 If , print You are young..
 If  and , print You are a teenager..
 Otherwise, print You are old..*/

public class Day4 {

    public static class Person{
        private int age;

        public Person(int initialAge) {
            if (initialAge > 0){
                this.age = initialAge;
            }else{
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }

        public void yearPasses(){
            this.age++;
        }

        public void amlOld(){
            if (this.age < 13){
                System.out.println("You are young.");
            }else if (this.age < 18){
                System.out.println("You are a teenager.");
            }else{
                System.out.println("You are old.");
            }
        }
    }

    public static void main(String[] args) {

        Person person = new Person(4);
        person.amlOld();

        Person person1 = new Person(-1);
        person1.amlOld();

        Person person2 = new Person(10);
        person2.amlOld();

        Person person3 = new Person(16);
        person3.amlOld();

        Person person4 = new Person(18);
        person4.amlOld();

    }

}
