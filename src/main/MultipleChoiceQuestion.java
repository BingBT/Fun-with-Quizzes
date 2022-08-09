package main;

public class MultipleChoiceQuestion extends Question {
    //class variables

    //constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer) {
        //answer = "A" OR "B"
        //answer = "a" or "b"

        String actualAnswer = this.getTheAnswer();
        //case insensitive
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        }else {
            return false;
        }
    }
}
