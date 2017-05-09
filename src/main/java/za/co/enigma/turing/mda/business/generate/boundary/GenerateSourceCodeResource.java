package za.co.enigma.turing.mda.business.generate.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import za.co.enigma.turing.mda.business.generate.control.SourceCodeGenerationManager;

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Path("generate")
@Stateless
public class GenerateSourceCodeResource {

	private SourceCodeGenerationManager sourceCodeGenerationManager;
	
	public GenerateSourceCodeResource(){}
	
	@Inject
	public GenerateSourceCodeResource(SourceCodeGenerationManager sourceCodeGenerationManager){
		this.sourceCodeGenerationManager = sourceCodeGenerationManager;
	}

	
	@GET
	public Response generateCode() throws Exception {
		boolean isSuccessful = sourceCodeGenerationManager.runCodeGenerationAgents();
		
		if (!isSuccessful) {
			throw new Exception("Failed to generated code");
		}
		return Response.ok().build();
	}
/*	
    @POST
    public Response register(Registration request, @Context UriInfo info) {
        JsonObject registration = registrations.register(request);
        long id = registration.getInt(Registrations.CONFIRMATION_ID);
        URI uri = info.getAbsolutePathBuilder().path("/" + id).build();
        return Response.created(uri).entity(registration).build();
    }

    @GET
    @Path("{id}")
    public Registration find(@PathParam("id") long registrationId) {
        return registrations.find(registrationId);
    }

    @GET
    public Response all() {
        JsonArray registrationList = this.registrations.allAsJson();
        if (registrationList == null || registrationList.isEmpty()) {
            return Response.noContent().build();
        }
        return Response.ok(registrationList).build();
    }*/
	
}
