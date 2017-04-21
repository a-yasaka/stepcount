package stepcount;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.Executor;

public class StepCount {

	public static void main(String args[]) throws ExecuteException, IOException{
		String basedir=args[0];
		final String cmdstr="dir /B /S >"+basedir+">"+basedir+"\\files.txt";
		CommandLine cmd=CommandLine.parse(cmdstr);
		Executor exec=new DefaultExecutor();
		exec.execute(cmd);
	}
}
