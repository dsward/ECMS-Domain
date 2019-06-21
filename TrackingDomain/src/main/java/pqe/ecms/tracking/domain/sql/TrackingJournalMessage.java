package pqe.ecms.tracking.domain.sql;

import pqe.ecms.tracking.domain.common.BaseTrackingEvent;

public class TrackingJournalMessage {

	private Long journalId;
	private BaseTrackingEvent baseTrackingEvent;

	public Long getJournalId() {
		return journalId;
	}

	public void setJournalId(Long journalId) {
		this.journalId = journalId;
	}

	public BaseTrackingEvent getBaseTrackingEvent() {
		return baseTrackingEvent;
	}

	public void setBaseTrackingEvent(BaseTrackingEvent baseTrackingEvent) {
		this.baseTrackingEvent = baseTrackingEvent;
	}

	@Override
	public String toString() {
		return "TrackingJournalMessage{" +
				"journalId=" + journalId +
				", baseTrackingEvent=" + baseTrackingEvent +
				'}';
	}
}
