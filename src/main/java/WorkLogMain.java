import auth.Keys;
import core.WLConfiguration;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import modules.DaggerMainComponent;
import modules.JdbiModule;
import modules.MainComponent;
import modules.MainModule;
import org.jose4j.keys.HmacKey;


public class WorkLogMain extends Application<WLConfiguration> {


    public static void main(String[] args) throws Exception {
        new WorkLogMain().run(args);
    }

    @Override
    public void run(WLConfiguration wlConfiguration, Environment environment) throws Exception {

        Keys keys = createKeys(wlConfiguration);

        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule(wlConfiguration, keys)).jdbiModule(new JdbiModule(WLConfiguration.getDataSourceFactory(), environment)).build();
        environment.jersey().register(component.provideEmployeeResource());
        environment.jersey().register(component.provideEmployeeWorkLogResource());
        environment.jersey().register(component.provideLoginResource());
    }

    @Override
    public void initialize(Bootstrap<WLConfiguration> bootstrap) {
        bootstrap.addBundle(new MigrationsBundle<WLConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(WLConfiguration configuration) {
                return WLConfiguration.getDataSourceFactory();
            }
        });
    }

    public HmacKey secretKey(String signatureSecret) {
        return new HmacKey(signatureSecret.getBytes());
    }

    public Keys createKeys(WLConfiguration configuration) {
        Keys keys = new Keys();
        HmacKey signatureKey = secretKey(configuration.getJwtSecretSignature());
        keys.setSignatureKey(signatureKey);
        return keys;
    }

}
