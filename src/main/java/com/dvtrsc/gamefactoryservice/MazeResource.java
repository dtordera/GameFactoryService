
package com.dvtrsc.gamefactoryservice;

import javax.ejb.Stateless;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.dvtrsc.games.mazeescape.Maze;

import org.codehaus.jackson.map.ObjectMapper;

@Stateless
@Path("/maze")
public class MazeResource 
{

    @GET
    @Produces("application/json")
    public String getNew(@QueryParam("w") int w, @QueryParam("h") int h) {		
		try
		{
			return new ObjectMapper().writeValueAsString (new Maze(w,h));
		}
		catch(Exception E)
		{
			return null;
		}
    }
}
