package com.hanains.guestbook.dao;

import java.util.List;

import com.hanains.guestbook.vo.GuestBookVo;

public class GuestBookTest {
	public static void main(String[] args){
		insertTest();
		getListTest();
	}
	public static void insertTest(){
		GuestBookDao dao = new GuestBookDao();
		GuestBookVo vo = new GuestBookVo();
		
		vo.setName("둘리");
		vo.setPassword("1234");
		vo.setMessage("장문의 메시지");
		
		dao.insert(vo);
	
	}
	public static void getListTest(){
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.getList();
		
		for(GuestBookVo vo : list){
			System.out.println(vo);
		}
	}
}
