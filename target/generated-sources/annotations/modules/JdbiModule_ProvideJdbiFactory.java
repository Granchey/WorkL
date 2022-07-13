package modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.dropwizard.jdbi3.JdbiFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.jdbi.v3.core.Jdbi;

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
public final class JdbiModule_ProvideJdbiFactory implements Factory<Jdbi> {
  private final JdbiModule module;

  private final Provider<JdbiFactory> factoryProvider;

  public JdbiModule_ProvideJdbiFactory(JdbiModule module, Provider<JdbiFactory> factoryProvider) {
    this.module = module;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public Jdbi get() {
    return provideJdbi(module, factoryProvider.get());
  }

  public static JdbiModule_ProvideJdbiFactory create(JdbiModule module,
      Provider<JdbiFactory> factoryProvider) {
    return new JdbiModule_ProvideJdbiFactory(module, factoryProvider);
  }

  public static Jdbi provideJdbi(JdbiModule instance, JdbiFactory factory) {
    return Preconditions.checkNotNullFromProvides(instance.provideJdbi(factory));
  }
}
