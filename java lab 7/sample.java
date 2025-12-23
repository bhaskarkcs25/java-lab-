class WrongAgeException extends Exception {
    public WrongAgeException(String msg) {
        super(msg);
    }
}

class Father {
    int fatherAge;

    Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative");
        }
        fatherAge = age;
        System.out.println("Father's age: " + fatherAge);
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);

        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative");
        }

        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be >= Father's age");
        }

        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}
public class sample {
    public static void main(String[] args) {
        try {
            Son s = new Son(40, 20);  
        } catch (WrongAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
