package com.alpergayretoglu.movie_provider.model.response;

import com.alpergayretoglu.movie_provider.model.entity.Category;
import com.alpergayretoglu.movie_provider.model.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class MovieResponse {

    private String title;
    private List<String> categories;

    public static MovieResponse fromEntity(Movie movie) {
        return new MovieResponse(
                movie.getTitle(),
                movie.getCategories().stream().map(Category::getName).toList()
        );
    }
}
