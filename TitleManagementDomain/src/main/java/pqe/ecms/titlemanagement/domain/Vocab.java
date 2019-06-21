package pqe.ecms.titlemanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by dsward on 4/18/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vocab {
    private String synaptica;
    private String kb;
    private String kbType;
    private String termType;

    public String getSynaptica() {
        return synaptica;
    }

    public void setSynaptica(String synaptica) {
        this.synaptica = synaptica;
    }

    public String getKb() {
        return kb;
    }

    public void setKb(String kb) {
        this.kb = kb;
    }

    public String getKbType() {
        return kbType;
    }

    public void setKbType(String kbType) {
        this.kbType = kbType;
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vocab) {
            if (null != synaptica && null != kb)
                return synaptica.equalsIgnoreCase(((Vocab) obj).synaptica) && kb.equalsIgnoreCase(((Vocab) obj).kb);
            else if (null != synaptica)
                return synaptica.equalsIgnoreCase(((Vocab) obj).synaptica);
            else if (null != kb)
                return kb.equalsIgnoreCase(((Vocab) obj).kb);
            else
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (synaptica + "-" + kb).hashCode();
    }
}
