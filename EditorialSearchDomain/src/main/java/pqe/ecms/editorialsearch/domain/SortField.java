package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import pqe.ecms.domain.exception.BuilderException;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("SortField")
public class SortField {

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Direction")
	private Direction direction;

	public enum Direction {
		asc, desc;
	}

	/**
	 * Only used for serialization purposes - not for regular object creation. <br>
	 * For the proper building of this object use the builder methods instead;
	 */
	public SortField() {

	}


	public static Builder newField() {
		return new Builder();
	}

	private SortField(final Builder builder) {
		this.name = builder.name;
		this.direction = builder.direction;
	}


	/**
	 * Builder class
	 */
	public static class Builder {
		private String name;
		private Direction direction;

		public Builder name(final String name) {
			this.name = name;
			return this;
		}

		public Builder direction(final Direction direction) {
			this.direction = direction;
			return this;
		}

		public SortField build() {
			if (name == null || direction == null) {
				throw new BuilderException("Missing one or more of required values for building the object:  name|direction");
			}

			return new SortField(this);
		}


	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("SortField [\n\tname=");
		builder2.append(name);
		builder2.append(", \n\tdirection=");
		builder2.append(direction);
		builder2.append("\n]");
		return builder2.toString();
	}


}
