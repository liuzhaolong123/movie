package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Movie;
import com.bawei.service.MovieService;
import com.bawei.vo.MovieVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@Controller
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@RequestMapping("list")
	public String list(Model m,MovieVo movieVo) {
		
		if (movieVo.getPageNum()==null) {
			movieVo.setPageNum(1);
		}
		PageHelper.startPage(movieVo.getPageNum(), 3);
		List<Movie> list = service.list(movieVo);
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		
		m.addAttribute("movieVo", movieVo);
		m.addAttribute("page", page);
		
		
		return "list";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public Object delete(Integer[] mids) {
	    Object flag = service.delete(mids);
		System.out.println(flag);
		return flag;
		
	}

}
