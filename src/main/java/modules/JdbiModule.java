package modules;

import dagger.Module;
import dagger.Provides;
import dao.EmployeeDao;
import dao.EmployeeWorkLogDao;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

import javax.inject.Singleton;

import static com.google.common.base.Preconditions.checkNotNull;

@Module
public class JdbiModule {

    private final DataSourceFactory configuration;
    private final Environment environment;

    public JdbiModule(DataSourceFactory configuration, Environment environment) {
        this.configuration = checkNotNull(configuration);
        this.environment = checkNotNull(environment);
    }

    @Singleton
    @Provides
    public JdbiFactory provideJdbiFactory() {
        return new JdbiFactory();
    }

    @Singleton
    @Provides
    public Jdbi provideJdbi(JdbiFactory factory){
        return factory.build(environment, configuration, "h2-db");
    }

    @Singleton
    @Provides
    public EmployeeDao provideEmployeeDao(Jdbi jdbi) {
        return jdbi.onDemand(EmployeeDao.class);
    }

    @Singleton
    @Provides
    public EmployeeWorkLogDao provideEmployeeWorkLogService(Jdbi jdbi){
        return jdbi.onDemand(EmployeeWorkLogDao.class);
    }
}