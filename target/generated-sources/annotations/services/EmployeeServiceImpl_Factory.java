package services;

import adapters.EmployeeAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dao.EmployeeDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class EmployeeServiceImpl_Factory implements Factory<EmployeeServiceImpl> {
  private final Provider<EmployeeDao> employeeDaoProvider;

  private final Provider<EmployeeAdapter> employeeAdapterProvider;

  public EmployeeServiceImpl_Factory(Provider<EmployeeDao> employeeDaoProvider,
      Provider<EmployeeAdapter> employeeAdapterProvider) {
    this.employeeDaoProvider = employeeDaoProvider;
    this.employeeAdapterProvider = employeeAdapterProvider;
  }

  @Override
  public EmployeeServiceImpl get() {
    return newInstance(employeeDaoProvider.get(), employeeAdapterProvider.get());
  }

  public static EmployeeServiceImpl_Factory create(Provider<EmployeeDao> employeeDaoProvider,
      Provider<EmployeeAdapter> employeeAdapterProvider) {
    return new EmployeeServiceImpl_Factory(employeeDaoProvider, employeeAdapterProvider);
  }

  public static EmployeeServiceImpl newInstance(EmployeeDao employeeDao,
      EmployeeAdapter employeeAdapter) {
    return new EmployeeServiceImpl(employeeDao, employeeAdapter);
  }
}
