package com.bawei.service;

import java.util.List;

import com.bawei.entity.Movie;
import com.bawei.vo.MovieVo;


public interface MovieService {
	
	List<Movie> list(MovieVo MovieVo);

	boolean delete(Integer[] mids);

}
