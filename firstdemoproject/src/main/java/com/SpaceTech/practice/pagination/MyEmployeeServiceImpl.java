package com.SpaceTech.practice.pagination;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

//@Service
public class MyEmployeeServiceImpl //implements MyEmploService
{
/*
	@Autowired
	MyEmploRepo repo;
	
	@Override
	public void saveMyEmployee() {
	List<MyEmployee> l1 = Arrays.asList(new MyEmployee("lfsjljjdkssljf","lfsjljjdkssljf",48),
			new MyEmployee("lfsjljjdkslsdj","lfsjljjdkslsdj",49),
			new MyEmployee("sklajlfsjljjdksfl","lfsjljjdkssklajfl",58),
			new MyEmployee("lfsjljjdksdsfsd","dslfsjljjdksfsd",54),
			new MyEmployee("dfslfsjljjdksf","dflfsjljjdkssf",55),
			new MyEmployee("dslfjljdljffsf","dsslfjljdljffsd",34),
			new MyEmployee("dslfjljdljfsfsd","dslfjljdljffsf",34),
			new MyEmployee("sdf","dfaewslfjljdljfe",37),
			new MyEmployee("dfaslfjljdljfewe","dfslfjljdljfsf",23),
			new MyEmployee("dsslfjljdljffsd","sdslfjljdljff",44),
			new MyEmployee("dfaslfjljdljfeweslfjljdljf","dsfsd",24),
			new MyEmployee("dfsslfjljdljff","slfjljdljf",54),
			new MyEmployee("dsfslfjljdljfsd","sljslfjljdljff",34),
			new MyEmployee("slslfjllsfjknjf","sdslfjllsfjknf",43),
			new MyEmployee("dsfslfjllsfjknsd","dfsslfjllsfjknf",23),
			new MyEmployee("dslfjllsfjknfaewe","dfaslfjllsfjknewe",45),
			new MyEmployee("dfslfjllsfjknsf","sslfjllsfjkndf",34),
			new MyEmployee("slfjllsfjknsdf","slfjllsfjkndfaewe",34),
			new MyEmployee("slfjllsfjknd","dfslfjllsfjknaewe",23),
			new MyEmployee("sslfjllsfjkndfs","slfjllsfjknsf",36),
			new MyEmployee("sslfjllsfjkndf","sfdslfjllsfjkns",67),
			new MyEmployee("fkslfjllsfjknjah","sfdslfjllsfjknd",45)
			);
		//repo.saveAll(l1);
	}

	@Override
	public void findAllMyEmployee(int pageNo, int pageSize) {
		
		//step 1 prepare pageable object using pageno and pagesize
		Pageable of = PageRequest.of(pageNo, pageSize);
		
		Page<MyEmployee> page = repo.findAll(of);
		
		System.out.println("page information....");
		
		System.out.println("page number " +page.getNumber());
		System.out.println("total pages " + page.getTotalElements());
		System.out.println("total element " + page.getTotalElements());
		System.out.println("page number  " + page.getNumber());
		
		List <MyEmployee> emp = page.getContent();
		emp.forEach(e->System.out.println(e.getId()+"  "+ e.getName()+"  "+e.getDob()+"  "+e.getAddres() +"  "));
	}

	@Override
	public void findAllMyEmployee(int pageNo, int pageSize, String colName) {
		Pageable pa = PageRequest.of(pageNo, pageSize, Sort.by(colName).ascending());
		Page<MyEmployee> page = repo.findAll(pa);
		System.out.println("page information....");
		
		System.out.println("page number " +page.getNumber());
		System.out.println("total pages " + page.getTotalElements());
		System.out.println("total element " + page.getTotalElements());
		System.out.println("page number  " + page.getNumber());
		
		List <MyEmployee> emp = page.getContent();
		emp.forEach(e->System.out.println(e.getId()+"  "+ e.getName()+"  "+e.getDob()+"  "+e.getAddres() +"  "));

		
	}
*/
	
	
}
