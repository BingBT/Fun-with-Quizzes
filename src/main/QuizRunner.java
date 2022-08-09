package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make?\nA: Bark\nB: Quack\nPlease just type a single letter as a answer", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckboxQuestion myCheckBoxQuestion = new CheckboxQuestion("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\n C: Owls", "B,C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        True_FalseQuestion myTrue_FalseQuestion = new True_FalseQuestion("Dogs are omnivores? \n True or False?", "True");
        myQuiz.addQuestion(myTrue_FalseQuestion);

        myQuiz.runQuiz();
    }
}
