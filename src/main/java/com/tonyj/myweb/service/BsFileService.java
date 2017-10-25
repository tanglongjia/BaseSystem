package com.tonyj.myweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonyj.frame.plugin.Page;
import com.tonyj.myweb.annotation.SystemLogService;
import com.tonyj.myweb.dao.BsFileDao;
import com.tonyj.myweb.po.BsFile;

@Service
public class BsFileService {
	
	@Autowired
	private BsFileDao bsFileDao;

	@SystemLogService(description = "查询文件列表")
	public Page selectPage(BsFile file,Page page){
		return bsFileDao.selectPage(file,page);
	}
	
	@SystemLogService(description = "保存文件")
	public void saveFile(BsFile file)throws Exception{
		bsFileDao.saveFile(file);
	}
	
	@SystemLogService(description = "查询单个文件")
	public BsFile selectSingle(Integer id)throws Exception{
		return bsFileDao.selectSingle(id);
	}
	
	@SystemLogService(description = "删除文件")
	public void deleteFile(Integer id)throws Exception{
		bsFileDao.deleteFile(id);
	}
}
