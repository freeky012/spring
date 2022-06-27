package VO;

import org.springframework.web.multipart.MultipartFile;

public class bbsVO {
	private int 			bbsNo;
	private String			name;
	private String			title;
	private String		 	photo;
	private String 			content;
	private String 			regdate;
	
	public bbsVO() {
		
	}

	public int getBbsNo() {
		return bbsNo;
	}

	public void setBbsNo(int bbsNo) {
		this.bbsNo = bbsNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "bbsVO [bbsNo=" + bbsNo + ", name=" + name + ", title=" + title + ", photo=" + photo + ", content="
				+ content + ", regdate=" + regdate + "]";
	}
	
	
	
}
