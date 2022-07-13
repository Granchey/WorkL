package modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.dropwizard.jdbi3.JdbiFactory;
import javax.annotation.processing.Generated;

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
public final class JdbiModule_ProvideJdbiFactoryFactory implements Factory<JdbiFactory> {
  private final JdbiModule module;

  public JdbiModule_ProvideJdbiFactoryFactory(JdbiModule module) {
    this.module = module;
  }

  @Override
  public JdbiFactory get() {
    return provideJdbiFactory(module);
  }

  public static JdbiModule_ProvideJdbiFactoryFactory create(JdbiModule module) {
    return new JdbiModule_ProvideJdbiFactoryFactory(module);
  }

  public static JdbiFactory provideJdbiFactory(JdbiModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideJdbiFactory());
  }
}
