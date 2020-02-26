package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MovieDao;
import com.bawei.entity.Movie;
import com.bawei.vo.MovieVo;


@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao dao;
	
	@Override
	public List<Movie> list(MovieVo MovieVo) {
		// TODO Auto-generated method stub
		
		return dao.list(MovieVo);
	}

	@Override
	public boolean delete(Integer[] mids) {
		// TODO Auto-generated method stub
		return dao.delete(mids);
	}

}
