package modules;

import Resources.EmployeeResource;
import Resources.EmployeeWorkLogResource;
import Resources.LoginResource;
import adapters.EmployeeAdapter;
import adapters.EmployeeWorkLogAdapter;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {JdbiModule.class, MainModule.class})
public interface MainComponent {
    EmployeeResource provideEmployeeResource();

    EmployeeWorkLogResource provideEmployeeWorkLogResource();

    EmployeeAdapter provideEmployeeAdapter();

    EmployeeWorkLogAdapter provideEmployeeWorkLogAdapter();

    LoginResource provideLoginResource();
}