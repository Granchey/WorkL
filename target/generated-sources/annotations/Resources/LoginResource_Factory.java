package Resources;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import services.LoginService;

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
public final class LoginResource_Factory implements Factory<LoginResource> {
  private final Provider<LoginService> loginServiceProvider;

  public LoginResource_Factory(Provider<LoginService> loginServiceProvider) {
    this.loginServiceProvider = loginServiceProvider;
  }

  @Override
  public LoginResource get() {
    return newInstance(loginServiceProvider.get());
  }

  public static LoginResource_Factory create(Provider<LoginService> loginServiceProvider) {
    return new LoginResource_Factory(loginServiceProvider);
  }

  public static LoginResource newInstance(LoginService loginService) {
    return new LoginResource(loginService);
  }
}
