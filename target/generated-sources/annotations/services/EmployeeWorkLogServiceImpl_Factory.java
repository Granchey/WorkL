package services;

import adapters.EmployeeWorkLogAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dao.EmployeeWorkLogDao;
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
public final class EmployeeWorkLogServiceImpl_Factory implements Factory<EmployeeWorkLogServiceImpl> {
  private final Provider<EmployeeWorkLogDao> employeeWorkLogDaoProvider;

  private final Provider<EmployeeWorkLogAdapter> employeeWorkLogAdapterProvider;

  public EmployeeWorkLogServiceImpl_Factory(Provider<EmployeeWorkLogDao> employeeWorkLogDaoProvider,
      Provider<EmployeeWorkLogAdapter> employeeWorkLogAdapterProvider) {
    this.employeeWorkLogDaoProvider = employeeWorkLogDaoProvider;
    this.employeeWorkLogAdapterProvider = employeeWorkLogAdapterProvider;
  }

  @Override
  public EmployeeWorkLogServiceImpl get() {
    return newInstance(employeeWorkLogDaoProvider.get(), employeeWorkLogAdapterProvider.get());
  }

  public static EmployeeWorkLogServiceImpl_Factory create(
      Provider<EmployeeWorkLogDao> employeeWorkLogDaoProvider,
      Provider<EmployeeWorkLogAdapter> employeeWorkLogAdapterProvider) {
    return new EmployeeWorkLogServiceImpl_Factory(employeeWorkLogDaoProvider, employeeWorkLogAdapterProvider);
  }

  public static EmployeeWorkLogServiceImpl newInstance(EmployeeWorkLogDao employeeWorkLogDao,
      EmployeeWorkLogAdapter employeeWorkLogAdapter) {
    return new EmployeeWorkLogServiceImpl(employeeWorkLogDao, employeeWorkLogAdapter);
  }
}
