package pqe.ecms.tracking.domain;

public class TrackingQueueConfig {
	private String trackingQueue;
	private String exportMessageQueue;

	public String getTrackingQueue() {
		return trackingQueue;
	}

	public void setTrackingQueue(String trackingQueue) {
		this.trackingQueue = trackingQueue;
	}

	public String getExportMessageQueue() {
		return exportMessageQueue;
	}

	public void setExportMessageQueue(String exportMessageQueue) {
		this.exportMessageQueue = exportMessageQueue;
	}
}
