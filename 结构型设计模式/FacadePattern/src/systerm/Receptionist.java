package systerm;

/**
 * 引导员（门面类）
 */
public class Receptionist {

    private Surgery surgery;

    private DepartmentProject departmentProject;

    private InternalMedicine internalMedicine;

    public Receptionist(){
        surgery = new Surgery();
        departmentProject = new DepartmentProject();
        internalMedicine = new InternalMedicine();
    }

    public void check(){
        surgery.surgeryCheck();
        departmentProject.departmentCheck();
        internalMedicine.internalCheck();
    }
}
