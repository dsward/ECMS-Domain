package pqe.ecms.tracking.domain.message;

import java.util.ArrayList;
import java.util.List;

public class ExportMessage {

	private List<TrackedExport> trackedExports;

	public ExportMessage() {
		trackedExports = new ArrayList<>();
	}

	public List<TrackedExport> getTrackedExports() {
		return trackedExports;
	}

	public void setTrackedExports(List<TrackedExport> trackedExports) {
		this.trackedExports = trackedExports;
	}

	@Override
	public String toString() {
		return "ExportMessage{" +
				"trackedExports=" + trackedExports +
				'}';
	}
}
