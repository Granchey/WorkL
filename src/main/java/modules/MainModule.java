package modules;

import auth.Keys;
import core.WLConfiguration;
import dagger.Module;
import dagger.Provides;
import services.EmployeeService;
import services.EmployeeServiceImpl;
import services.EmployeeWorkLogService;
import services.EmployeeWorkLogServiceImpl;
import services.LoginService;
import services.LoginServiceImpl;

import javax.inject.Singleton;
import java.util.Objects;

@Module
public class MainModule {

    private final WLConfiguration config;

    private final Keys keys;

    public MainModule(WLConfiguration config, Keys keys) {
        this.config = Objects.requireNonNull(config);
        this.keys = keys;
    }

    @Singleton
    @Provides
    EmployeeService provideEmployeeService(EmployeeServiceImpl employeeService) {
        return employeeService;
    }

    @Singleton
    @Provides
    EmployeeWorkLogService provideEmployeeWorkLogService(EmployeeWorkLogServiceImpl employeeWorkLogService) {
        return employeeWorkLogService;
    }

    @Singleton
    @Provides
    LoginService provideJwtBuilderService(LoginServiceImpl jwtBuilderService) {
        return jwtBuilderService;
    }

    @Provides
    Keys provideKeys() {
        return keys;
    }
}