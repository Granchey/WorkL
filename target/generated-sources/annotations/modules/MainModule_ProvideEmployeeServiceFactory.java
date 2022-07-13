package modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import services.EmployeeService;
import services.EmployeeServiceImpl;

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
public final class MainModule_ProvideEmployeeServiceFactory implements Factory<EmployeeService> {
  private final MainModule module;

  private final Provider<EmployeeServiceImpl> employeeServiceProvider;

  public MainModule_ProvideEmployeeServiceFactory(MainModule module,
      Provider<EmployeeServiceImpl> employeeServiceProvider) {
    this.module = module;
    this.employeeServiceProvider = employeeServiceProvider;
  }

  @Override
  public EmployeeService get() {
    return provideEmployeeService(module, employeeServiceProvider.get());
  }

  public static MainModule_ProvideEmployeeServiceFactory create(MainModule module,
      Provider<EmployeeServiceImpl> employeeServiceProvider) {
    return new MainModule_ProvideEmployeeServiceFactory(module, employeeServiceProvider);
  }

  public static EmployeeService provideEmployeeService(MainModule instance,
      EmployeeServiceImpl employeeService) {
    return Preconditions.checkNotNullFromProvides(instance.provideEmployeeService(employeeService));
  }
}
