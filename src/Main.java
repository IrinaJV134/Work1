class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();

    }
    @FunctionalInterface
    public interface OnTaskDoneListener extends Worker.OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener extends Worker.OnTaskErrorListener {
        void onError(String result);
    }
}

