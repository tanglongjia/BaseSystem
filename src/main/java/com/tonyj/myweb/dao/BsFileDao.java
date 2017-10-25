package com.tonyj.myweb.dao;

import org.springframework.stereotype.Repository;

import com.tonyj.frame.orm.MyBatisDao;
import com.tonyj.frame.plugin.Page;
import com.tonyj.myweb.po.BsFile;

@Repository
public class BsFileDao extends MyBatisDao<BsFile> {

	public Page selectPage(BsFile bsFile,Page page){
		return this.selectPage(bsFile,page,"selectPage");
	}
	
	public void saveFile(BsFile bsFile)throws Exception{
		this.insert(bsFile);
	}
	
	public void deleteFile(Integer id){
		this.getSqlSession().delete("com.tonyj.myweb.po.BsFile.deleteFile", id);
	}
}
