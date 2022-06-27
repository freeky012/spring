package com.computer.DAO;

import java.sql.*;
import java.util.ArrayList;

import com.computer.DTO.memberDTO;



public class memberDAO {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private Connection getConnection(){
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbId = "C##JSP";
		String dbPwd = "1234";
				
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(url, dbId, dbPwd);
				
			} catch (ClassNotFoundException e) {
				System.out.print("DB 연결 실패");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.print("DB 연결 실패");
				e.printStackTrace();
			}
			return conn;
			
	}
	
	public int userCheck(String id, String password) {
		
		
		String dbPassword=null;			
		int x=-1;
		
		try {
		conn = getConnection();
		pstmt = conn.prepareStatement("select password from member where id = ?");
		pstmt.setString(1, id);
		rs= pstmt.executeQuery();
		
		if(rs.next())
		{
			dbPassword= rs.getString("password"); 
					
			if(dbPassword.equals(password))
				x= 1; //인증 성공
				else
				x= 0; //비밀번호 틀림
			}else
			x= -1;//해당 아이디 없음
		
			
		} catch(Exception e) {
			e.printStackTrace();
						
		} 
		
			if (rs != null) try { rs.close(); } catch(SQLException e) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
			if (conn != null) try { conn.close(); } catch(SQLException e) {}
				
			return x;
				
	}


	public int joinMember(memberDTO member) {
		
				int result = 0;
				
				try {
				conn = getConnection();
				pstmt = conn.prepareStatement("insert into member values (mem_seq.nextval,?,?,?,?,?,?,sysdate,?,?)");
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getEmail());
				pstmt.setString(4, member.getTel());
				pstmt.setString(5, member.getAddr());
				pstmt.setString(6, member.getJob());
				pstmt.setInt(7, member.getAge());
				pstmt.setString(8, member.getContent());
				
				result = pstmt.executeUpdate();
								
			} catch(Exception e) {
				result = -1;
							
			}  
				
				if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				if (conn != null) try { conn.close(); } catch(SQLException ex) {}
				return result;
			
	
		}
	
	
	public ArrayList<memberDTO> listMember() {
		
		ArrayList<memberDTO> list = new ArrayList<>();
	
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from member");
			rs = pstmt.executeQuery();
						
			while(rs.next())
			{
				memberDTO memberdto = new memberDTO();
				
				memberdto.setNum(rs.getInt(1));
				memberdto.setId(rs.getString(2));
				memberdto.setPassword(rs.getString(3));
				memberdto.setEmail(rs.getString(4));
				memberdto.setTel(rs.getString(5));
				memberdto.setAddr(rs.getString(6));
				memberdto.setJob(rs.getString(7));
				memberdto.setRegDate(rs.getString(8));
				memberdto.setAge(rs.getInt(9));
				memberdto.setContent(rs.getString(10));
						
				list.add(memberdto);
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		
		} 
			if (rs != null) try { rs.close(); } catch(SQLException e) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
			if (conn != null) try { conn.close(); } catch(SQLException e) {}
			return list;
			
	}
	
	public memberDTO detailMember(String id)
	{
		conn = getConnection();
		memberDTO memberdto = new memberDTO();
				
		try
		{
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				memberdto.setNum(rs.getInt(1));
				memberdto.setId(rs.getString(2));
				memberdto.setPassword(rs.getString(3));
				memberdto.setEmail(rs.getString(4));
				memberdto.setTel(rs.getString(5));
				memberdto.setAddr(rs.getString(6));
				memberdto.setJob(rs.getString(7));
				memberdto.setRegDate(rs.getString(8));
				memberdto.setAge(rs.getInt(9));
				memberdto.setContent(rs.getString(10));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if (rs != null) try { rs.close(); } catch(SQLException e) {}
		if (pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
		if (conn != null) try { conn.close(); } catch(SQLException e) {}
		return memberdto;
		
	}
	
	public int updateMember(memberDTO member) {
		
			int result = 0;
				
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement("select * from member where id = ? and password = ?");
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPassword());
				pstmt.executeQuery();
					
				
				pstmt = conn.prepareStatement("update member set email = ? , tel = ? , addr = ? ,job = ?, age = ?, content = ? where id = ?");
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getTel());
				pstmt.setString(3, member.getAddr());
				pstmt.setString(4, member.getJob());
				pstmt.setInt(5, member.getAge());
				pstmt.setString(6, member.getContent());
				pstmt.setString(7, member.getId());
				result = pstmt.executeUpdate();
								
			} 
			
			catch(Exception e) 
			{
				e.printStackTrace();
				return result = -1;
				
			} 
				if (pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
				if (conn != null) try { conn.close(); } catch(SQLException e) {}
				return result;
	}
	
	public int dropMember(String id) {
		
		int result = 0;
			
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("delete from member where id = ?");
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} 
		
		catch(Exception e) 
		{
			e.printStackTrace();
			return result = -1;
			
		} 
			if (pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
			if (conn != null) try { conn.close(); } catch(SQLException e) {}
			return result;
}

	
}