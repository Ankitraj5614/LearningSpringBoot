package com.SpaceTech.practice.pagination;

public interface MyEmploService  {
	void saveMyEmployee();
	void findAllMyEmployee(int pageNo, int pageSize);
	void findAllMyEmployee(int pageNo, int pageSize, String sort);
}
