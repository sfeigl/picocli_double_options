import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name="Test")
public class TestMain implements Callable<Integer> {

	private CommandLine commandLine;

	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		CommandLine commandLine = new CommandLine(testMain);
		testMain.commandLine = commandLine;

		commandLine.addMixin("MixIn", new MixIn());
		commandLine.execute(args);
	}


	@Override
	public Integer call() throws CommandLine.ParameterException {
		throw new CommandLine.ParameterException(commandLine, "Force help");
	}
}
