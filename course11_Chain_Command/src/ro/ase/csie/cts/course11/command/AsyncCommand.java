package ro.ase.csie.cts.course11.command;

public class AsyncCommand extends AsyncTask{

    String taskName;
    int priority;
    GameModuleInterface module = null;

    public AsyncCommand(String taskName, GameModuleInterface module) {
        super();
        this.taskName = taskName;
        this.module = module;
    }

    @Override
    public void asyncExecute() {
        this.module.doTask(taskName);
    }
}
