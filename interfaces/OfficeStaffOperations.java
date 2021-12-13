package interfaces;
import java.lang.*;
import classes.OfficeStaff;

public interface OfficeStaffOperations
{
	boolean insertOfficeStaff(OfficeStaff e);
	boolean removeOfficeStaff(OfficeStaff e);
	OfficeStaff searchOfficeStaff(String empId);
	void showAllOfficeStaffs();
}