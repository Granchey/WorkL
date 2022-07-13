package Resources;

import adapters.EmployeeWorkLogAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import services.EmployeeWorkLogService;

@ScopeMetadata
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
public final class EmployeeWorkLogResource_Factory implements Factory<EmployeeWorkLogResource> {
  private final Provider<EmployeeWorkLogService> employeeWorkLogServiceProvider;

  private final Provider<EmployeeWorkLogAdapter> employeeWorkLogAdapterProvider;

  public EmployeeWorkLogResource_Factory(
      Provider<EmployeeWorkLogService> employeeWorkLogServiceProvider,
      Provider<EmployeeWorkLogAdapter> employeeWorkLogAdapterProvider) {
    this.employeeWorkLogServiceProvider = employeeWorkLogServiceProvider;
    this.employeeWorkLogAdapterProvider = employeeWorkLogAdapterProvider;
  }

  @Override
  public EmployeeWorkLogResource get() {
    return newInstance(employeeWorkLogServiceProvider.get(), employeeWorkLogAdapterProvider.get());
  }

  public static EmployeeWorkLogResource_Factory create(
      Provider<EmployeeWorkLogService> employeeWorkLogServiceProvider,
      Provider<EmployeeWorkLogAdapter> employeeWorkLogAdapterProvider) {
    return new EmployeeWorkLogResource_Factory(employeeWorkLogServiceProvider, employeeWorkLogAdapterProvider);
  }

  public static EmployeeWorkLogResource newInstance(EmployeeWorkLogService employeeWorkLogService,
      EmployeeWorkLogAdapter employeeWorkLogAdapter) {
    return new EmployeeWorkLogResource(employeeWorkLogService, employeeWorkLogAdapter);
  }
}
