package lesson7.task2;

class Worker implements Position {
    String post = "Worker";
    Worker (String post) {
        this.post = post;
    }

    @Override
    public void output() {
        System.out.println("Название должности: " + post);
    }
}

