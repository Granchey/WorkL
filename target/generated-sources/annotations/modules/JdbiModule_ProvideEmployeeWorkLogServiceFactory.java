package modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dao.EmployeeWorkLogDao;
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
public final class JdbiModule_ProvideEmployeeWorkLogServiceFactory implements Factory<EmployeeWorkLogDao> {
  private final JdbiModule module;

  private final Provider<Jdbi> jdbiProvider;

  public JdbiModule_ProvideEmployeeWorkLogServiceFactory(JdbiModule module,
      Provider<Jdbi> jdbiProvider) {
    this.module = module;
    this.jdbiProvider = jdbiProvider;
  }

  @Override
  public EmployeeWorkLogDao get() {
    return provideEmployeeWorkLogService(module, jdbiProvider.get());
  }

  public static JdbiModule_ProvideEmployeeWorkLogServiceFactory create(JdbiModule module,
      Provider<Jdbi> jdbiProvider) {
    return new JdbiModule_ProvideEmployeeWorkLogServiceFactory(module, jdbiProvider);
  }

  public static EmployeeWorkLogDao provideEmployeeWorkLogService(JdbiModule instance, Jdbi jdbi) {
    return Preconditions.checkNotNullFromProvides(instance.provideEmployeeWorkLogService(jdbi));
  }
}
