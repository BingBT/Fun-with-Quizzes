package main;

public class True_FalseQuestion extends Question {
    //class variables

    //constructor
    public True_FalseQuestion(String question, String answer) {
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer) {
        //answer = "true" "false"
        //answer = "TRUE" "FALSE"
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        }else{
            return false;
        }

    }
}
