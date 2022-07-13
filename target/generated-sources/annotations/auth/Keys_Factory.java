package auth;

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
public final class Keys_Factory implements Factory<Keys> {
  @Override
  public Keys get() {
    return newInstance();
  }

  public static Keys_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Keys newInstance() {
    return new Keys();
  }

  private static final class InstanceHolder {
    private static final Keys_Factory INSTANCE = new Keys_Factory();
  }
}
