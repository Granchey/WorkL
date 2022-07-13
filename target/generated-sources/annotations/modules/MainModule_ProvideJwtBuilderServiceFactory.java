package modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import services.LoginService;
import services.LoginServiceImpl;

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
public final class MainModule_ProvideJwtBuilderServiceFactory implements Factory<LoginService> {
  private final MainModule module;

  private final Provider<LoginServiceImpl> jwtBuilderServiceProvider;

  public MainModule_ProvideJwtBuilderServiceFactory(MainModule module,
      Provider<LoginServiceImpl> jwtBuilderServiceProvider) {
    this.module = module;
    this.jwtBuilderServiceProvider = jwtBuilderServiceProvider;
  }

  @Override
  public LoginService get() {
    return provideJwtBuilderService(module, jwtBuilderServiceProvider.get());
  }

  public static MainModule_ProvideJwtBuilderServiceFactory create(MainModule module,
      Provider<LoginServiceImpl> jwtBuilderServiceProvider) {
    return new MainModule_ProvideJwtBuilderServiceFactory(module, jwtBuilderServiceProvider);
  }

  public static LoginService provideJwtBuilderService(MainModule instance,
      LoginServiceImpl jwtBuilderService) {
    return Preconditions.checkNotNullFromProvides(instance.provideJwtBuilderService(jwtBuilderService));
  }
}
