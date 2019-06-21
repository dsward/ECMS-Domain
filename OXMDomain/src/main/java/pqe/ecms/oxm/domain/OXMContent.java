package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 * This class is used as the interface for the OXMS <br />
 *
 * @author rtabassi
 */

@JsonRootName("OXMContent")
public abstract class OXMContent implements Serializable {

	private static final long serialVersionUID = 1L;

}
