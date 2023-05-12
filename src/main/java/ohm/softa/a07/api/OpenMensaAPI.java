package ohm.softa.a07.api;

import ohm.softa.a07.model.Meal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by Peter Kurfer on 11/19/17.
 */

public interface OpenMensaAPI {

	@GET("canteens/269/days/{date}/meals")
	Call<List<Meal>> getMeals (@Path("date") String Date);
}
