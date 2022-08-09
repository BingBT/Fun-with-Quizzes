package main;

public class CheckboxQuestion extends Question {

    //class variables

    //constructor
    public CheckboxQuestion(String question, String answer) {
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer) {
        //answer = "A, B, C"
        //answer = "a, b, c"
        String actualAnswer = this.getTheAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        }else {
            return false;
        }
    }
}
