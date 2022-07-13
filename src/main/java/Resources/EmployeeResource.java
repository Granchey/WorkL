package Resources;

import adapters.EmployeeAdapter;
import dto.EmployeeDto;
import services.EmployeeService;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {
    private final EmployeeService employeeService;

    @Inject
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GET
    @Path("/{employeeId}")
    public EmployeeDto findEmployeeById(@NotNull @PathParam("employeeId") Integer employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        return employeeService.addEmployee(employeeDto);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateEmployee(@NotNull EmployeeDto employeeDto) {
        employeeService.updateEmployee(employeeDto);
    }

    @DELETE
    @Path("/{employeeId}")
    public void deleteEmployee(@NotNull @PathParam("employeeId") Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

}