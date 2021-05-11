package ro.ase.csie.cts.course11.command;

public class UpdateModule implements GameModuleInterface{

    @Override
    public void doTask(String taskName) {
        System.out.println("Updating.... " + taskName);
    }
}
