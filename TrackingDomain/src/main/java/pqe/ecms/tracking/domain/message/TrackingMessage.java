package pqe.ecms.tracking.domain.message;

import pqe.ecms.tracking.domain.common.BaseTrackingEvent;

import java.util.ArrayList;
import java.util.List;

public class TrackingMessage {

	private List<BaseTrackingEvent> trackingEvents;

	private TrackingMessage() {
		this.trackingEvents = new ArrayList<>();
	}

	public static TrackingMessage.Builder builder() {
		return new TrackingMessage.Builder();
	}

	public List<BaseTrackingEvent> getTrackingEvents() {
		return trackingEvents;
	}

	public void setTrackingEvents(List<BaseTrackingEvent> trackingEvents) {
		this.trackingEvents = trackingEvents;
	}

	@Override
	public String toString() {
		return "TrackingMessage{" +
				"trackingEvents=" + trackingEvents +
				'}';
	}

	public static class Builder {
		private List<BaseTrackingEvent> baseTrackingEvents;

		private Builder() {
			this.baseTrackingEvents = new ArrayList<>();
		}

		public Builder trackingEvents(List<BaseTrackingEvent> events) {
			this.baseTrackingEvents = events;
			return this;
		}

		public TrackingMessage build() {
			TrackingMessage trackingMessage = new TrackingMessage();
			trackingMessage.setTrackingEvents(baseTrackingEvents);
			return trackingMessage;
		}
	}
}
