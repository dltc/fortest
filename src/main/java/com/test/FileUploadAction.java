package com.test;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private File data;

	private String dataFileName;

	private String dataContentType;

	@Override
	public String execute() throws Exception {
		System.out.println("上传文件名为:" + dataFileName);
		System.out.println("上传文件类型为:" + dataContentType);
		System.out.println("上传文件的大小:"+data.length());
		System.out.println(this);
		return null;
	}

	@Override
	public String toString() {
		return "FileUploadAction [data=" + data + ", dataFileName="
				+ dataFileName + ", dataContentType=" + dataContentType + "]";
	}

	public File getData() {
		return data;
	}

	public void setData(File data) {
		this.data = data;
	}

	public String getDataFileName() {
		return dataFileName;
	}

	public void setDataFileName(String dataFileName) {
		this.dataFileName = dataFileName;
	}

	public String getDataContentType() {
		return dataContentType;
	}

	public void setDataContentType(String dataContentType) {
		this.dataContentType = dataContentType;
	}
}
