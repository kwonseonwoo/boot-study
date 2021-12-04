package com.example.mypractice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mypractice.domain.BoardVO;

@Mapper
public interface BoardMapper {

	public List<BoardVO> getList();
}
