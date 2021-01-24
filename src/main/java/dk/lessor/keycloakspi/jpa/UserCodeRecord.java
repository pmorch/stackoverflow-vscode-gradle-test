package dk.lessor.keycloakspi.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FORCE_USER_CODE")
@NamedQueries({ @NamedQuery(name = "findById", query = "from ForceUserCodeRecord where id = :id") })
public class UserCodeRecord {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "CLIENT_ID", nullable = false)
    private String clientId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "CREATION_TIME")
    private Date creationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}
