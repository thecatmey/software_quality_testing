package ro.ase.csie.cts.course11.command;

import java.sql.SQLOutput;

public class BackupModule implements GameModuleInterface{

    @Override
    public void doTask(String taskName) {
        System.out.println("Backing up.... " + taskName);
    }
}
