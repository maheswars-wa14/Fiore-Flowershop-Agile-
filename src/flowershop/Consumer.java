/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Atlas
 */
public class Consumer {
    private int consumerID , creditlimit;
    private String consumerName, consumerStatus;

    public Consumer(int consumerID, int creditlimit, String consumerName, String consumerStatus) {
        this.consumerID = consumerID;
        this.creditlimit = creditlimit;
        this.consumerName = consumerName;
        this.consumerStatus = consumerStatus;
    }
    private static final Logger LOG = Logger.getLogger(Consumer.class.getName());

    public int getConsumerID() {
        return consumerID;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public String getConsumerStatus() {
        return consumerStatus;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setConsumerID(int consumerID) {
        this.consumerID = consumerID;
    }

    public void setCreditlimit(int creditlimit) {
        this.creditlimit = creditlimit;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public void setConsumerStatus(String consumerStatus) {
        this.consumerStatus = consumerStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.consumerID;
        hash = 17 * hash + this.creditlimit;
        hash = 17 * hash + Objects.hashCode(this.consumerName);
        hash = 17 * hash + Objects.hashCode(this.consumerStatus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consumer other = (Consumer) obj;
        if (this.consumerID != other.consumerID) {
            return false;
        }
        if (this.creditlimit != other.creditlimit) {
            return false;
        }
        if (!Objects.equals(this.consumerName, other.consumerName)) {
            return false;
        }
        if (!Objects.equals(this.consumerStatus, other.consumerStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consumer{" + "consumerID=" + consumerID + ", creditlimit=" + creditlimit + ", consumerName=" + consumerName + ", consumerStatus=" + consumerStatus + '}';
    }
    
    
    
}
