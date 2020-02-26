package com.bawei.dao;

import java.util.List;

import com.bawei.entity.Movie;
import com.bawei.vo.MovieVo;



public interface MovieDao {
	
	List<Movie> list(MovieVo MovieVo);

	boolean delete(Integer[] mids);

}
