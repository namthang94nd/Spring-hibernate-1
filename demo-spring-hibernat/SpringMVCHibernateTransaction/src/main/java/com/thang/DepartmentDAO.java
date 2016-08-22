package com.thang;

import java.util.List;

import com.thang.Department;
 
public interface DepartmentDAO {
 
  public List<Department> listDepartment() ;
  
  public Integer getMaxDeptId();
  
  public void createDepartment(String name,String location);  
}