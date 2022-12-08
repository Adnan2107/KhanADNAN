package hiberstudent.studentdao;

import hiberstudent.studententities.student;

public interface studentdao {
	
	public boolean insertstudent(student st);
    public student getstudent(int id);
    public boolean updatestudent(int id);
    public boolean deletestudent(int id);
}
