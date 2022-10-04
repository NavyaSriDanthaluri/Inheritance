package p1;

public class Project{
	
		String projectName;
		int allocatedDays;
		public Project() {
	    super();

		}
		public Project(String projectName, int allocatedDays) {
			super();
			this.projectName = projectName;
			this.allocatedDays = allocatedDays;
		}

		public String getProjectName() {
	return projectName;
}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public int getAllocatedDays() {
			return allocatedDays;
		}
		public void setAllocatedDays(int allocatedDays) {
			this.allocatedDays = allocatedDays;
		}
}


