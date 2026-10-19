import java.util.ArrayList;

void main() {
    ArrayList<String> tasks = new ArrayList<>();
    boolean running = true;

    while (running) {
        IO.println("1. Show tasks");
        IO.println("2. Add task");
        IO.println("3. Remove task");
        IO.println("4. Exit");
        String pick = IO.readln("Select an option 1-4: ");

        switch (pick) {
            case "1": {
                if (tasks.isEmpty()) {
                    IO.println("No tasks yet");
                    IO.println("----------------");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        IO.println("- " + tasks.get(i));

                    }

                }
                break;
            }
            case "2": {
                IO.println("----------");
                String task = IO.readln("Task: ");
                IO.println("-----------------");
                tasks.add(task);
                break;
            }
            case "3": {
                int number = Integer.parseInt(IO.readln("Task number to remove: "));
                if (number >= 1 && number <= tasks.size()) {
                    tasks.remove(number - 1);
                } else {
                    IO.println("No task with that number");
                    IO.println("----------------");
                }
                break;
            }
            case "4":
                running = false;
                break;
            default:
                IO.println("Invalid choice");
                IO.println("----------------");
        }
    }
}
