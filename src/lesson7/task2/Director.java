package lesson7.task2;

public class Director implements Position {
        String post = "Director";
        @Override
        public void output() {
            System.out.println("Название должности: " + post);
        }
}
