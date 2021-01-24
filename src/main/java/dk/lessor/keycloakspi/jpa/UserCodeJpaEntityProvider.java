package dk.lessor.keycloakspi.jpa;

import org.keycloak.connections.jpa.entityprovider.JpaEntityProvider;

import java.util.Collections;
import java.util.List;

public class UserCodeJpaEntityProvider implements JpaEntityProvider {
    @Override
    public List<Class<?>> getEntities() {
        return Collections.singletonList(UserCodeRecord.class);
    }

    @Override
    public String getChangelogLocation() {
        return "META-INF/userCode-db-changelog.xml";
    }

    @Override
    public void close() {
    }

    @Override
    public String getFactoryId() {
        return UserCodeJpaEntityProviderFactory.ID;
    }

}
