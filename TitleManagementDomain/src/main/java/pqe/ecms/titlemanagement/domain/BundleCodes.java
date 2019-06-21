package pqe.ecms.titlemanagement.domain;

import java.util.ArrayList;
import java.util.List;

public class BundleCodes {

	private List<String> bundleCodes = new ArrayList<>();

	public static BundleCodes from(List<String> bundleCodes) {
		BundleCodes result = new BundleCodes();
		result.getBundleCodes().addAll(bundleCodes);
		return result;
	}

	public List<String> getBundleCodes() {
		return bundleCodes;
	}

	public void setBundleCodes(List<String> bundleCodes) {
		this.bundleCodes = bundleCodes;
	}

	@Override
	public String toString() {
		return "BundleCodes{" +
				"bundleCodes=" + bundleCodes +
				'}';
	}
}
