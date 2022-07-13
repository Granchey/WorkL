package adapters;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class EmployeeAdapter_Factory implements Factory<EmployeeAdapter> {
  @Override
  public EmployeeAdapter get() {
    return newInstance();
  }

  public static EmployeeAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EmployeeAdapter newInstance() {
    return new EmployeeAdapter();
  }

  private static final class InstanceHolder {
    private static final EmployeeAdapter_Factory INSTANCE = new EmployeeAdapter_Factory();
  }
}
