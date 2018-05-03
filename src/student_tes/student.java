package student_tes;

public class student {
	//constroctor
	 public student (String student_code,int student_Number,String student_Name, String Branch_Name ) {
		 this.studentCode = student_code;
		 this.studentName =student_Name;
		 this.studentNumber =student_Number;
		 this.BranchName =Branch_Name;
		 
		 
	 }
	public int studentNumber;
	public String studentCode;
	public String studentName; 
	public String BranchName;
	
	public String [] setAllData () {
	String [] strAll = {String.valueOf(studentNumber),studentCode,studentName,BranchName };
	return strAll;
	
}

	public String getAllDataInString() {
	
	String strall = String.valueOf(studentNumber)+" ; " + studentCode +" ; " +studentName +" ; " +BranchName +" ; " ;
	return strall;
	
}
}