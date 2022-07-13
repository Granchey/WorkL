package modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import services.EmployeeWorkLogService;
import services.EmployeeWorkLogServiceImpl;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainModule_ProvideEmployeeWorkLogServiceFactory implements Factory<EmployeeWorkLogService> {
  private final MainModule module;

  private final Provider<EmployeeWorkLogServiceImpl> employeeWorkLogServiceProvider;

  public MainModule_ProvideEmployeeWorkLogServiceFactory(MainModule module,
      Provider<EmployeeWorkLogServiceImpl> employeeWorkLogServiceProvider) {
    this.module = module;
    this.employeeWorkLogServiceProvider = employeeWorkLogServiceProvider;
  }

  @Override
  public EmployeeWorkLogService get() {
    return provideEmployeeWorkLogService(module, employeeWorkLogServiceProvider.get());
  }

  public static MainModule_ProvideEmployeeWorkLogServiceFactory create(MainModule module,
      Provider<EmployeeWorkLogServiceImpl> employeeWorkLogServiceProvider) {
    return new MainModule_ProvideEmployeeWorkLogServiceFactory(module, employeeWorkLogServiceProvider);
  }

  public static EmployeeWorkLogService provideEmployeeWorkLogService(MainModule instance,
      EmployeeWorkLogServiceImpl employeeWorkLogService) {
    return Preconditions.checkNotNullFromProvides(instance.provideEmployeeWorkLogService(employeeWorkLogService));
  }
}
