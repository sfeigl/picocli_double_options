import picocli.CommandLine;

public class MixIn {


	@CommandLine.ArgGroup(validate = false, heading = "Heading\n")
	private OptionGroup group;
}
