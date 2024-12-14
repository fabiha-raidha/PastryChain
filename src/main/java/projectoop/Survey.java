package projectoop;

public class Survey {
    private String Questions;

    public Survey(String questions) {
        Questions = questions;
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    @Override
    public String toString() {
        return STR."Survey{Questions='\{Questions}'}";
    }


}
