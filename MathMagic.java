public class MathMagic {
    public static void main(String[] args) {

        int myNumber = 17;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour / myNumber;
        int stepSix = stepFive / 1;

        System.out.println(stepSix);
    }
}

// first project & only project in the first part of the Learn Java course
