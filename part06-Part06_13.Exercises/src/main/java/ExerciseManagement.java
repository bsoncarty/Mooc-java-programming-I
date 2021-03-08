
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : this.exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public boolean isCompleted(String exercise) {
        for (Exercise lift : this.exercises) {
            if (lift.getName().equals(exercise)) {
                return lift.isCompleted();
            }
        }
        return false;
    }

    public void markAsCompleted(String exercise) {
        for (Exercise lift : this.exercises) {
            if (lift.getName().equals(exercise)) {
                lift.setCompleted(true);
            }
        }
    }
}
