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
public final class EmployeeWorkLogAdapter_Factory implements Factory<EmployeeWorkLogAdapter> {
  @Override
  public EmployeeWorkLogAdapter get() {
    return newInstance();
  }

  public static EmployeeWorkLogAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EmployeeWorkLogAdapter newInstance() {
    return new EmployeeWorkLogAdapter();
  }

  private static final class InstanceHolder {
    private static final EmployeeWorkLogAdapter_Factory INSTANCE = new EmployeeWorkLogAdapter_Factory();
  }
}
