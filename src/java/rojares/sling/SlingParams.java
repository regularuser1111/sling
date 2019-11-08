package rojares.sling;

import java.net.InetSocketAddress;

/**
 * Class defining the recognized parameters of sling needed for connecting, authenticating and other configuration of
 * the session.
 */
public class SlingParams {

    // 0 means all tuples
    int maxTuples = 1000;

    public int getMaxTuples() {
        return maxTuples;
    }

    public SlingParams setMaxTuples(int maxTuples) {
        if (maxTuples < 0) this.maxTuples = 0;
        else this.maxTuples = maxTuples;
        return this;
    }


}
