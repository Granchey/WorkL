package Resources;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import services.EmployeeService;

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
public final class EmployeeResource_Factory implements Factory<EmployeeResource> {
  private final Provider<EmployeeService> employeeServiceProvider;

  public EmployeeResource_Factory(Provider<EmployeeService> employeeServiceProvider) {
    this.employeeServiceProvider = employeeServiceProvider;
  }

  @Override
  public EmployeeResource get() {
    return newInstance(employeeServiceProvider.get());
  }

  public static EmployeeResource_Factory create(Provider<EmployeeService> employeeServiceProvider) {
    return new EmployeeResource_Factory(employeeServiceProvider);
  }

  public static EmployeeResource newInstance(EmployeeService employeeService) {
    return new EmployeeResource(employeeService);
  }
}
