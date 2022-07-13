package modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dao.EmployeeDao;
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
public final class JdbiModule_ProvideEmployeeDaoFactory implements Factory<EmployeeDao> {
  private final JdbiModule module;

  private final Provider<Jdbi> jdbiProvider;

  public JdbiModule_ProvideEmployeeDaoFactory(JdbiModule module, Provider<Jdbi> jdbiProvider) {
    this.module = module;
    this.jdbiProvider = jdbiProvider;
  }

  @Override
  public EmployeeDao get() {
    return provideEmployeeDao(module, jdbiProvider.get());
  }

  public static JdbiModule_ProvideEmployeeDaoFactory create(JdbiModule module,
      Provider<Jdbi> jdbiProvider) {
    return new JdbiModule_ProvideEmployeeDaoFactory(module, jdbiProvider);
  }

  public static EmployeeDao provideEmployeeDao(JdbiModule instance, Jdbi jdbi) {
    return Preconditions.checkNotNullFromProvides(instance.provideEmployeeDao(jdbi));
  }
}
