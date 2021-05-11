package ro.ase.csie.cts.course11.command;

import java.util.ArrayList;

public class TaskManager {

    ArrayList<AsyncTask> tasks = new ArrayList<>();

    public void addAsyncTask(AsyncTask task){
        tasks.add(task);
    }

    public void execute(){
        if(tasks.size() > 0){
            AsyncTask taskToExecute = tasks.get(0);
            tasks.remove(0);
            taskToExecute.asyncExecute();
        }
    }
}
