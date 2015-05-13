package it.polimi.spark;

import java.util.List;

public class Stage {
	long jobId;
	long id;
	private List<Long> parentIDs;
	String name;

	/**
	 * @param jobId
	 * @param stageId
	 * @param parentIDs
	 * @param name
	 */
	public Stage(long jobId, long id, List<Long> parentIDs, String name) {
		super();
		this.jobId = jobId;
		this.id = id;
		this.parentIDs = parentIDs;
		this.name = name;
	}

	public long getJobId() {
		return jobId;
	}

	public long getId() {
		return id;
	}

	public List<Long> getParentIDs() {
		return parentIDs;
	}

	public String getName() {
		return name;
	}

}