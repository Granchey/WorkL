package modules;

import auth.Keys;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class MainModule_ProvideKeysFactory implements Factory<Keys> {
  private final MainModule module;

  public MainModule_ProvideKeysFactory(MainModule module) {
    this.module = module;
  }

  @Override
  public Keys get() {
    return provideKeys(module);
  }

  public static MainModule_ProvideKeysFactory create(MainModule module) {
    return new MainModule_ProvideKeysFactory(module);
  }

  public static Keys provideKeys(MainModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideKeys());
  }
}
