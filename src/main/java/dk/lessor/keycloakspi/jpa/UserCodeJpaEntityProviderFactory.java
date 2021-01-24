package dk.lessor.keycloakspi.jpa;

import org.keycloak.Config;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProvider;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class UserCodeJpaEntityProviderFactory  implements JpaEntityProviderFactory {
    protected static final String ID = "force-user-code-entity-provider";

    @Override
    public JpaEntityProvider create(KeycloakSession session) {
        return new UserCodeJpaEntityProvider();
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public void init(Config.Scope config) {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

    @Override
    public void close() {
    }

}
