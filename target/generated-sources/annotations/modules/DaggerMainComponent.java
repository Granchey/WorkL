package modules;

import Resources.EmployeeResource;
import Resources.EmployeeWorkLogResource;
import Resources.LoginResource;
import adapters.EmployeeAdapter;
import adapters.EmployeeAdapter_Factory;
import adapters.EmployeeWorkLogAdapter;
import adapters.EmployeeWorkLogAdapter_Factory;
import auth.Keys;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dao.EmployeeDao;
import dao.EmployeeWorkLogDao;
import io.dropwizard.jdbi3.JdbiFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.jdbi.v3.core.Jdbi;
import services.EmployeeService;
import services.EmployeeServiceImpl;
import services.EmployeeServiceImpl_Factory;
import services.EmployeeWorkLogService;
import services.EmployeeWorkLogServiceImpl;
import services.EmployeeWorkLogServiceImpl_Factory;
import services.LoginService;
import services.LoginServiceImpl;
import services.LoginServiceImpl_Factory;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainComponent implements MainComponent {
  private final DaggerMainComponent mainComponent = this;

  private Provider<JdbiFactory> provideJdbiFactoryProvider;

  private Provider<Jdbi> provideJdbiProvider;

  private Provider<EmployeeDao> provideEmployeeDaoProvider;

  private Provider<EmployeeServiceImpl> employeeServiceImplProvider;

  private Provider<EmployeeService> provideEmployeeServiceProvider;

  private Provider<EmployeeWorkLogDao> provideEmployeeWorkLogServiceProvider;

  private Provider<EmployeeWorkLogServiceImpl> employeeWorkLogServiceImplProvider;

  private Provider<EmployeeWorkLogService> provideEmployeeWorkLogServiceProvider2;

  private Provider<Keys> provideKeysProvider;

  private Provider<LoginServiceImpl> loginServiceImplProvider;

  private Provider<LoginService> provideJwtBuilderServiceProvider;

  private DaggerMainComponent(JdbiModule jdbiModuleParam, MainModule mainModuleParam) {

    initialize(jdbiModuleParam, mainModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final JdbiModule jdbiModuleParam, final MainModule mainModuleParam) {
    this.provideJdbiFactoryProvider = DoubleCheck.provider(JdbiModule_ProvideJdbiFactoryFactory.create(jdbiModuleParam));
    this.provideJdbiProvider = DoubleCheck.provider(JdbiModule_ProvideJdbiFactory.create(jdbiModuleParam, provideJdbiFactoryProvider));
    this.provideEmployeeDaoProvider = DoubleCheck.provider(JdbiModule_ProvideEmployeeDaoFactory.create(jdbiModuleParam, provideJdbiProvider));
    this.employeeServiceImplProvider = EmployeeServiceImpl_Factory.create(provideEmployeeDaoProvider, EmployeeAdapter_Factory.create());
    this.provideEmployeeServiceProvider = DoubleCheck.provider(MainModule_ProvideEmployeeServiceFactory.create(mainModuleParam, employeeServiceImplProvider));
    this.provideEmployeeWorkLogServiceProvider = DoubleCheck.provider(JdbiModule_ProvideEmployeeWorkLogServiceFactory.create(jdbiModuleParam, provideJdbiProvider));
    this.employeeWorkLogServiceImplProvider = EmployeeWorkLogServiceImpl_Factory.create(provideEmployeeWorkLogServiceProvider, EmployeeWorkLogAdapter_Factory.create());
    this.provideEmployeeWorkLogServiceProvider2 = DoubleCheck.provider(MainModule_ProvideEmployeeWorkLogServiceFactory.create(mainModuleParam, employeeWorkLogServiceImplProvider));
    this.provideKeysProvider = MainModule_ProvideKeysFactory.create(mainModuleParam);
    this.loginServiceImplProvider = LoginServiceImpl_Factory.create(provideKeysProvider);
    this.provideJwtBuilderServiceProvider = DoubleCheck.provider(MainModule_ProvideJwtBuilderServiceFactory.create(mainModuleParam, loginServiceImplProvider));
  }

  @Override
  public EmployeeResource provideEmployeeResource() {
    return new EmployeeResource(provideEmployeeServiceProvider.get());
  }

  @Override
  public EmployeeWorkLogResource provideEmployeeWorkLogResource() {
    return new EmployeeWorkLogResource(provideEmployeeWorkLogServiceProvider2.get(), new EmployeeWorkLogAdapter());
  }

  @Override
  public EmployeeAdapter provideEmployeeAdapter() {
    return new EmployeeAdapter();
  }

  @Override
  public EmployeeWorkLogAdapter provideEmployeeWorkLogAdapter() {
    return new EmployeeWorkLogAdapter();
  }

  @Override
  public LoginResource provideLoginResource() {
    return new LoginResource(provideJwtBuilderServiceProvider.get());
  }

  public static final class Builder {
    private JdbiModule jdbiModule;

    private MainModule mainModule;

    private Builder() {
    }

    public Builder jdbiModule(JdbiModule jdbiModule) {
      this.jdbiModule = Preconditions.checkNotNull(jdbiModule);
      return this;
    }

    public Builder mainModule(MainModule mainModule) {
      this.mainModule = Preconditions.checkNotNull(mainModule);
      return this;
    }

    public MainComponent build() {
      Preconditions.checkBuilderRequirement(jdbiModule, JdbiModule.class);
      Preconditions.checkBuilderRequirement(mainModule, MainModule.class);
      return new DaggerMainComponent(jdbiModule, mainModule);
    }
  }
}
