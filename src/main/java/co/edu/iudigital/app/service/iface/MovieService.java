package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Movie;

public interface MovieService {
	
	public List<Movie> getAll();

	public void create(Movie movie);
	
	public void edit(Movie movie, int movieId);

	public void delete(int movieId);
	
	public void rate(Movie movie, int movieId);
	
}
