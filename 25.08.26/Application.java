package queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class Application {

	ArrayDeque<Task> task=new ArrayDeque<>();
	void Addtask(Task newTask) {
		task.offer(newTask);
	}
	void showAllTask() {
		for(Task t:task) {
			System.out.println(t);
		}
	}
	void nextTask() {
		System.out.println(task.peek());
	}
	void removeTask() {
		task.poll();
	}

}
