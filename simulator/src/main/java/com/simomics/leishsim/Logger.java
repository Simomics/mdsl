package com.simomics.leishsim;

/**
 * Writes log messages generated by the simulation.
 */
public interface Logger {

	/** A prefix to include on all log file names */
	public static final String FILE_PREFIX = "output_";
	
	/**
	 * Write a message to this log.
	 * @param message
	 */
	public void log(String message);
	
	/**
	 * Write a message to this log, regarding the given exception.
	 * @param message
	 * @param exception
	 */
	public void log(String message, Throwable exception);
}
