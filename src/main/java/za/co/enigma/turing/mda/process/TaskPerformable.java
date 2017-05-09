package za.co.enigma.turing.mda.process;

public interface TaskPerformable {

	// todo diff states , start , processing , finished, aborted. etc
	public boolean execute() throws Exception;
}
