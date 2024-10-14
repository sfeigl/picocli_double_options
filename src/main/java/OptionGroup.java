import picocli.CommandLine;

public class OptionGroup {

	@CommandLine.Option(names="--double", description = "This option is doubled")
	boolean option;

}
