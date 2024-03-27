package lesson7.task2;

class Accountant implements Position {
    String post = "Accountant";
    Accountant (String post) {
        this.post = post;
    }

    @Override
    public void output() {
        System.out.println("Название должности: " + post);
    }
}
